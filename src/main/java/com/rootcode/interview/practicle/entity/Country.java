package com.rootcode.interview.practicle.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @Column(name="country_code_3")
    private String countryCode3;
    @Column(nullable=false)
    private String country;
    @Column(name="country_code_2")
    private String countryCode2;
    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "country")
    private List<GDPValue> gdpDataList = new ArrayList<>();

    public Country() {
    }

    public Country(String countryCode3, String country, String countryCode2, List<GDPValue> gdpDataList) {
        this.countryCode3 = countryCode3;
        this.country = country;
        this.countryCode2 = countryCode2;
        this.gdpDataList = gdpDataList;
    }

    public Country(String countryCode3, String country, String countryCode2) {
        this.countryCode3 = countryCode3;
        this.country = country;
        this.countryCode2 = countryCode2;
    }

    public String getCountryCode3() {
        return countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode2() {
        return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public List<GDPValue> getGdpDataList() {
        return gdpDataList;
    }

    public void setGdpDataList(List<GDPValue> gdpDataList) {
        this.gdpDataList = gdpDataList;
    }


}
