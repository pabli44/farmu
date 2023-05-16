package com.pvelilla.farmuoperations.farmuoperations.mapper;

import com.pvelilla.farmuoperations.farmuoperations.dto.ImageDto;
import com.pvelilla.farmuoperations.farmuoperations.dto.UrlDto;
import com.pvelilla.farmuoperations.farmuoperations.entity.Image;
import com.pvelilla.farmuoperations.farmuoperations.entity.Url;

public class AllMapper {

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

    public static Image getImageEntity(ImageDto imageDto){
        Image entity = new Image();
        entity.setId(imageDto.getId());
        entity.setWidth(imageDto.getWidth());
        entity.setHeight(imageDto.getHeight());

        return entity;
    }

    public static ImageDto getImageDto(Image entity){
        ImageDto imageDto = new ImageDto();
        imageDto.setId(entity.getId());
        imageDto.setWidth(entity.getWidth());
        imageDto.setHeight(entity.getHeight());

        return imageDto;
    }

}
