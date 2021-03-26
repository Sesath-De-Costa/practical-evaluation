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

    public Country(String countryCode3, String country, String countryCode2) {
        this.countryCode3 = countryCode3;
        this.country = country;
        this.countryCode2 = countryCode2;
    }
}
