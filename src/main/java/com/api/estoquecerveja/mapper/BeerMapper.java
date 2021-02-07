package com.api.estoquecerveja.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.api.estoquecerveja.dto.BeerDTO;
import com.api.estoquecerveja.entity.Beer;

/***
 * 
 * @author dionatan
 *
 */

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}

