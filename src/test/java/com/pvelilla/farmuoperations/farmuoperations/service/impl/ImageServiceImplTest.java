package com.pvelilla.farmuoperations.farmuoperations.service.impl;

import com.pvelilla.farmuoperations.farmuoperations.dto.ImageDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.util.Assert;

import static org.mockito.Mockito.when;

class ImageServiceImplTest {


    private static final Long IMAGE_ID = 1L;
    @Mock
    private ImageServiceImpl imageService;

    private ImageDto dto;

    @BeforeEach
    void setUp() {
        dto = new ImageDto();
        dto.setId(IMAGE_ID);
        dto.setWidth(200);
        dto.setHeight(150);
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void save() {
        when(imageService.save(dto)).thenReturn(dto);
        Assert.notNull(imageService.save(dto));
    }
}