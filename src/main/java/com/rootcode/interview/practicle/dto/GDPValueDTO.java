package com.rootcode.interview.practicle.dto;

import com.rootcode.interview.practicle.entity.Country;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

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
public class GDPValueDTO implements Serializable {
    private int id;
    private int year;
    private double gdp;
    private Country country;
}
