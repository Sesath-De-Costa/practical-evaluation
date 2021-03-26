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
    GDPValueBO gdpValueBO;

    @GetMapping("/{country:/^[A-Z]{2,3}$/}/{year:\\d{4}}")
    public double getGDPValueByCountryCode3AndYear(@PathVariable String country, @PathVariable int year) throws Exception {
        if (country.length() == 3) {
            return gdpValueBO.getGDPByCountryCode3(country, year);
        } else {
            return gdpValueBO.getGDPByCountryCode2(country, year);
        }
    }
}
