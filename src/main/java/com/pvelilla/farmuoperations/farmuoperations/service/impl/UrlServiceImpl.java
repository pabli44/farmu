package com.pvelilla.farmuoperations.farmuoperations.service.impl;

import com.pvelilla.farmuoperations.farmuoperations.dto.UrlDto;
import com.pvelilla.farmuoperations.farmuoperations.entity.Url;
import com.pvelilla.farmuoperations.farmuoperations.mapper.UrlMapper;
import com.pvelilla.farmuoperations.farmuoperations.repository.UrlRepository;
import com.pvelilla.farmuoperations.farmuoperations.service.UrlService;
import com.pvelilla.farmuoperations.farmuoperations.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UrlServiceImpl implements UrlService {

    @Autowired
    private UrlRepository urlRepository;


    @Override
    public Url save(Url entity) {
        entity.setShortName(Utils.getShortUrl(entity.getName()));
        return urlRepository.save(entity);
    }

    @Override
    public Optional<Url> findById(Long id) {
        return urlRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        urlRepository.deleteById(id);
    }

    @Override
    public List<UrlDto> findAll() {
        return urlRepository.findAll()
                .stream().map(UrlMapper::getUrlDto)
                .collect(Collectors.toList());
    }
}
