package com.rootcode.interview.practicle.business.custom.impl;

import com.rootcode.interview.practicle.business.custom.GDPValueBO;
import com.rootcode.interview.practicle.dao.CountryDAO;
import com.rootcode.interview.practicle.dao.GDPValueDAO;
import com.rootcode.interview.practicle.entity.Country;
import com.rootcode.interview.practicle.entity.GDPValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
    private GDPValueDAO gdpValueDAO;
    @Autowired
    private CountryDAO countryDAO;

    public GDPValueBOImpl() {
    }

    @Override
    public double getGDPByCountryCode(String countryCode, int year) {
        Country country = null;
        double gdp1 = -1;
        double gdp2 = -1;
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
        for (GDPValue gdpValue : country.getGdpDataList()) {
            if (gdpValue.getYear() == (year - 1)) {
                gdp1 = gdpValue.getGdp();
            } else if (gdpValue.getYear() == (year)) {
                gdp2 = gdpValue.getGdp();
            }
            if (gdp1 != -1 && gdp2 == -1) {
                break;
            }
        }
        return (gdp2 - gdp1) / (gdp1) * 100;
    }
}
