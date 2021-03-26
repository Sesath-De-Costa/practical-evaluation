package com.rootcode.interview.practicle.business.util;

import com.rootcode.interview.practicle.dto.GDPValueDTO;
import com.rootcode.interview.practicle.entity.CountryGDPValuePK;
import org.mapstruct.Mapper;

/**
 * Created by Sesath De Costa on 2021-03-26
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@Mapper(componentModel = "spring")
public interface EntityDTOMapper {

    GDPValueDTO getGDPValueDTO(CountryGDPValuePK countryGDPValuePK);

    CountryGDPValuePK getCountryGDPValuePK(GDPValueDTO GDPValueDTO);
}
