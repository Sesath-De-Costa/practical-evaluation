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

    public GDPValue() {
    }

    public GDPValue(int id, int year, double gdp, Country country) {
        this.id = id;
        this.year = year;
        this.gdp = gdp;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


}
