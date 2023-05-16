package com.pvelilla.farmuoperations.farmuoperations.service.impl;

import com.pvelilla.farmuoperations.farmuoperations.dto.UrlDto;
import com.pvelilla.farmuoperations.farmuoperations.entity.Url;
import com.pvelilla.farmuoperations.farmuoperations.mapper.AllMapper;
import com.pvelilla.farmuoperations.farmuoperations.repository.UrlRepository;
import com.pvelilla.farmuoperations.farmuoperations.service.UrlService;
import com.pvelilla.farmuoperations.farmuoperations.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.pvelilla.farmuoperations.farmuoperations.mapper.AllMapper.getUrlDto;
import static com.pvelilla.farmuoperations.farmuoperations.mapper.AllMapper.getUrlEntity;

@Service
public class UrlServiceImpl implements UrlService {

    @Autowired
    private UrlRepository urlRepository;


    @Override
    public UrlDto save(UrlDto urlDto) {
        Url entity = getUrlEntity(urlDto);
        entity.setShortName(Utils.getShortUrl(entity.getName()));
        urlRepository.save(entity);

        return getUrlDto(entity);
    }

    @Override
    public UrlDto findById(Long id) {
        UrlDto urlDto = getUrlDto(urlRepository.findById(id).get());
        return urlDto;
    }

    @Override
    public void deleteById(Long id) {
        urlRepository.deleteById(id);
    }

    @Override
    public List<UrlDto> findAll() {
        return urlRepository.findAll()
                .stream().map(AllMapper::getUrlDto)
                .collect(Collectors.toList());
    }
}
