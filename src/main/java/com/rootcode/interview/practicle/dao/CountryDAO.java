package com.rootcode.interview.practicle.dao;

import com.rootcode.interview.practicle.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


/**
 * Created by Sesath De Costa on 2021-03-26
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
public interface CountryDAO extends JpaRepository<Country, String> {

    Optional<Country> findCountryByCountryCode2(String code);
}
