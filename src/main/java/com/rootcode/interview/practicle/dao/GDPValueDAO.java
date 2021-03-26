package com.rootcode.interview.practicle.dao;

import com.rootcode.interview.practicle.entity.GDPValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


/**
 * Created by Sesath De Costa on 2021-03-26
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
public interface GDPValueDAO extends JpaRepository<GDPValue, Integer> {

//    @Query("select g.country.countryCode3,g.gdp from GDPValue g join on Country c  )
//    default GDPValue findByCountryAndAndYear(String country, int year){
//
//    }

}
