package com.pvelilla.farmuoperations.farmuoperations.service;

import com.pvelilla.farmuoperations.farmuoperations.dto.UrlDto;

import java.util.List;

public interface UrlService {

    UrlDto save(UrlDto urlDto);

    UrlDto findById(Long id);

    void deleteById(Long id);

    List<UrlDto> findAll();
}
