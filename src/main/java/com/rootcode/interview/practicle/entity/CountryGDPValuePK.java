package com.rootcode.interview.practicle.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Sesath De Costa on 2021-03-26
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CountryGDPValuePK implements Serializable {
    @Column(name = "country_code3")
    private String countryCode3;
    @Column(name = "gdp_value")
    private String gdpValue;
}
