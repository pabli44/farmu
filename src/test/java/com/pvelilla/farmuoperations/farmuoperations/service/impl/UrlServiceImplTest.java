package com.pvelilla.farmuoperations.farmuoperations.service.impl;

import com.pvelilla.farmuoperations.farmuoperations.dto.UrlDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.util.Assert;

import static org.mockito.Mockito.when;

class UrlServiceImplTest {


    private static final Long IMAGE_ID = 1L;
    private static final String URL_TEST = "www.google.com";

    @Mock
    private UrlServiceImpl urlService;

    private UrlDto dto;

    @BeforeEach
    void setUp() {
        dto = new UrlDto();
        dto.setId(IMAGE_ID);
        dto.setName(URL_TEST);
        dto.setShortName("");
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void save() {
        when(urlService.save(dto)).thenReturn(dto);
        Assert.notNull(urlService.save(dto));
    }

    @Test
    void findById() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findAll() {
    }
}