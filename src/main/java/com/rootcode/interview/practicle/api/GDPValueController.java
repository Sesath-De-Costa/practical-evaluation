package com.rootcode.interview.practicle.api;

import com.rootcode.interview.practicle.business.custom.GDPValueBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Sesath De Costa on 2021-03-26
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/

@CrossOrigin
@RequestMapping("/api/v1/GDP_values")
@RestController
public class GDPValueController {

    @Autowired
    private GDPValueBO gdpValueBO;

    //Rest endpoint for get the gdp value for a country in a particular year
    @GetMapping(value = "/{country:[A-Z]{2,3}}", params = "year")
    public double[] getGDPValueByCountryCodeAndYear(@PathVariable("country") String country, @RequestParam("year") int year) {
        return gdpValueBO.getGDPByCountryCode(country, year);
    }
}
