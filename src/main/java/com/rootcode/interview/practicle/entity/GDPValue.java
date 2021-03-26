package com.rootcode.interview.practicle.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
@Table(name = "gdp_value")
public class GDPValue implements SuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private int year;
    @Column(nullable = false)
    private double gdp;
    @ManyToOne
    @JoinColumn(name = "code", referencedColumnName = "country_code_3", nullable = false)
    private Country country;
}
