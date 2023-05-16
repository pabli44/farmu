package com.pvelilla.farmuoperations.farmuoperations.service.impl;

import com.pvelilla.farmuoperations.farmuoperations.dto.ImageDto;
import com.pvelilla.farmuoperations.farmuoperations.entity.Image;
import com.pvelilla.farmuoperations.farmuoperations.mapper.AllMapper;
import com.pvelilla.farmuoperations.farmuoperations.repository.ImageRepository;
import com.pvelilla.farmuoperations.farmuoperations.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.pvelilla.farmuoperations.farmuoperations.mapper.AllMapper.getImageDto;
import static com.pvelilla.farmuoperations.farmuoperations.mapper.AllMapper.getImageEntity;
import static com.pvelilla.farmuoperations.farmuoperations.utils.Utils.resizeImage;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public ImageDto save(ImageDto imageDto) {
        resizeImage("", imageDto.getWidth(), imageDto.getHeight());
        Image entity = imageRepository.save(getImageEntity(imageDto));
        return getImageDto(entity);
    }


    @Override
    public List<ImageDto> findAll() {
        return imageRepository.findAll()
                            .stream().map(AllMapper::getImageDto)
                            .collect(Collectors.toList());
    }

}
