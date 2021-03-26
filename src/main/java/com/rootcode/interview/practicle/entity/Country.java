package com.rootcode.interview.practicle.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Sesath De Costa on 2021-03-26
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "country")
public class Country implements SuperEntity{
    @Id
    @Column(name = "country_code_3")
    private String countryCode3;
    @Column(name = "country_code_2")
    private String countryCode2;
    private String country;
    private int numeric;
}
