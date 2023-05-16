package com.pvelilla.farmuoperations.farmuoperations.repository;

import com.pvelilla.farmuoperations.farmuoperations.entity.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends CrudRepository<Image, Long> {

    Image save(Image image);

    List<Image> findAll();

}
