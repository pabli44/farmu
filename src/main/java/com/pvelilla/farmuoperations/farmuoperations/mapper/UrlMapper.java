package com.pvelilla.farmuoperations.farmuoperations.mapper;

import com.pvelilla.farmuoperations.farmuoperations.dto.UrlDto;
import com.pvelilla.farmuoperations.farmuoperations.entity.Url;

import java.util.Optional;

public class UrlMapper {

    public static Url getUrlEntity(UrlDto urlDto){
        Url entity = new Url();
        entity.setId(urlDto.getId());
        entity.setName(urlDto.getName());
        entity.setShortName(urlDto.getShortName());

        return entity;
    }

    public static UrlDto getUrlDto(Url entity){
        UrlDto dto = new UrlDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setShortName(entity.getShortName());

        return dto;
    }

}
