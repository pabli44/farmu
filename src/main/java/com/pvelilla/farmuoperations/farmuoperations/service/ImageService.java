package com.pvelilla.farmuoperations.farmuoperations.service;

import com.pvelilla.farmuoperations.farmuoperations.dto.ImageDto;

import java.util.List;

public interface ImageService {

    ImageDto save(ImageDto imageDto);

    List<ImageDto> findAll();

}
