package com.rootcode.interview.practicle.business.custom;

import com.rootcode.interview.practicle.entity.GDPValue;

import java.util.List;

/**
 * Created by Sesath De Costa on 2021-03-26
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
public interface GDPValueBO {

    double[] getGDPByCountryCode(String country, int year);

    List<GDPValue> getGPDValueCustomRange(List<GDPValue> gpdList);

}
