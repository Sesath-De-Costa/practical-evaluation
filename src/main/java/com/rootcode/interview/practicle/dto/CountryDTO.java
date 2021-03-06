package com.rootcode.interview.practicle.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by Sesath De Costa on 2021-03-26
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CountryDTO {

    private String countryCode3;
    private String country;
    private String countryCode2;
}
