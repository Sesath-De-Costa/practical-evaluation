package com.rootcode.interview.practicle.business.custom.impl;

import com.rootcode.interview.practicle.business.custom.GDPValueBO;
import com.rootcode.interview.practicle.dao.GDPValueDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Sesath De Costa on 2021-03-26
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
public class GDPValueBOImpl implements GDPValueBO {

    @Autowired
    GDPValueDAO gdpValueDAO;

    public GDPValueBOImpl(){
    }

    @Override
    public double getGDP(String country, int year) throws Exception {
        return 0;
    }
}
