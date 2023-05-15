package com.pvelilla.farmuoperations.farmuoperations.controller;

import com.pvelilla.farmuoperations.farmuoperations.dto.UrlDto;
import com.pvelilla.farmuoperations.farmuoperations.entity.Url;
import com.pvelilla.farmuoperations.farmuoperations.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.pvelilla.farmuoperations.farmuoperations.mapper.UrlMapper.getUrlDto;
import static com.pvelilla.farmuoperations.farmuoperations.mapper.UrlMapper.getUrlEntity;

@RequestMapping("/url")
@RestController
public class UrlController {

    @Autowired
    private UrlService urlService;

    @GetMapping("/{id}")
    public UrlDto findById(@PathVariable Long id){
        return getUrlDto(urlService.findById(id).get());
    }

    @DeleteMapping("/{id}")
    public void deletedById(@PathVariable Long id){
        urlService.deleteById(id);
    }

    @PostMapping
    public Url save(@RequestBody UrlDto urlDto){
        return urlService.save(getUrlEntity(urlDto));
    }

    @GetMapping
    public List<UrlDto> findAll(){
        return urlService.findAll();
    }


}
