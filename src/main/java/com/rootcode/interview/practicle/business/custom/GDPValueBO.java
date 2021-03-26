package com.rootcode.interview.practicle.business.custom;

import com.rootcode.interview.practicle.business.SuperBO;

/**
 * Created by Sesath De Costa on 2021-03-26
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
public interface GDPValueBO extends SuperBO {
    double getGDPByCountryCode3(String country, int year) throws Exception;

    double getGDPByCountryCode2(String country, int year) throws Exception;
}
