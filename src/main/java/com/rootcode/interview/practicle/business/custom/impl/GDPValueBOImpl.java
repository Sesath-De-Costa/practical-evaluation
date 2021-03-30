package com.rootcode.interview.practicle.business.custom.impl;

import com.rootcode.interview.practicle.business.custom.GDPValueBO;
import com.rootcode.interview.practicle.dao.CountryDAO;
import com.rootcode.interview.practicle.entity.Country;
import com.rootcode.interview.practicle.entity.GDPValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by Sesath De Costa on 2021-03-26
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/

@Transactional
@Service
public class GDPValueBOImpl implements GDPValueBO {

    @Autowired
    private CountryDAO countryDAO;

    public GDPValueBOImpl() {
    }

    @Override
    public double[] getGDPByCountryCode(String countryCode, int year) {
        double[] gdpValues = new double[2];
        Country country;

        if (countryCode.trim().length() == 3) {
            Optional<Country> optCountry = countryDAO.findById(countryCode);
            if (!optCountry.isPresent()) {
                throw new RuntimeException("Invalid Country Code");
            } else {
                country = optCountry.get();
            }
        } else {
            Optional<Country> optCountry = countryDAO.findCountryByCountryCode2(countryCode);
            if (!optCountry.isPresent()) {
                throw new RuntimeException("Invalid Country Code");
            } else {
                country = optCountry.get();
            }
        }
        return generateGDPValue(country.getGdpDataList(), year);
    }

    @Override
    public List<GDPValue> getGPDValueCustomRange(List<GDPValue> gpdList) {
        for (GDPValue gdpValue : gpdList) {
            if (gdpValue.getYear() < 2007) {
                gpdList.remove(gdpValue);
            }
        }
        return gpdList;
    }

    double[] generateGDPValue(List<GDPValue> gdpValues, int year) {
        double gdp1 = -1;
        double gdp2 = -1;
        double gdp3 = -1;
        for (GDPValue gdpValue : getGPDValueCustomRange(gdpValues)) {
            if (gdpValue.getYear() == (year)) {
                gdp1 = gdpValue.getGdp();
            } else if (gdpValue.getYear() == (year - 1)) {
                gdp2 = gdpValue.getGdp();
            } else if (gdpValue.getYear() == (year - 2)) {
                gdp3 = gdpValue.getGdp();
            }
            if (gdp1 != -1 && gdp2 != -1 && gdp3 != -1) {
                break;
            }
        }
        return new double[]{((gdp1 - gdp2) / gdp2) * 100, ((gdp2 - gdp3) / gdp3) * 100};
    }
}
