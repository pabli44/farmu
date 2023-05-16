package com.pvelilla.farmuoperations.farmuoperations.controller;

import com.pvelilla.farmuoperations.farmuoperations.dto.UrlDto;
import com.pvelilla.farmuoperations.farmuoperations.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/url")
@RestController
public class UrlController {

    @Autowired
    private UrlService urlService;

    @GetMapping("/{id}")
    public UrlDto findById(@PathVariable Long id){
        return urlService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletedById(@PathVariable Long id){
        urlService.deleteById(id);
    }

    @PostMapping
    public UrlDto save(@RequestBody UrlDto urlDto){
        return urlService.save(urlDto);
    }

    @GetMapping
    public List<UrlDto> findAll(){
        return urlService.findAll();
    }


}
