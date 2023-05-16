package com.pvelilla.farmuoperations.farmuoperations.controller;

import com.pvelilla.farmuoperations.farmuoperations.dto.ImageDto;
import com.pvelilla.farmuoperations.farmuoperations.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/image")
@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping
    public ImageDto saveOrResize(@RequestBody ImageDto imageDto){
        return imageService.save(imageDto);
    }

    @GetMapping
    public List<ImageDto> findAll(){
        return imageService.findAll();
    }


}
