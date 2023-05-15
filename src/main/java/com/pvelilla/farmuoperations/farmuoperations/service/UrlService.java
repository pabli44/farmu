package com.pvelilla.farmuoperations.farmuoperations.service;

import com.pvelilla.farmuoperations.farmuoperations.dto.UrlDto;
import com.pvelilla.farmuoperations.farmuoperations.entity.Url;

import java.util.List;
import java.util.Optional;

public interface UrlService {

    Url save(Url url);

    Optional<Url> findById(Long id);

    void deleteById(Long id);

    List<UrlDto> findAll();
}
