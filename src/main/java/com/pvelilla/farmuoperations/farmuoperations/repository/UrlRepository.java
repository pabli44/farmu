package com.pvelilla.farmuoperations.farmuoperations.repository;

import com.pvelilla.farmuoperations.farmuoperations.entity.Url;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UrlRepository extends CrudRepository<Url, Long> {
    Url save(Url entity);

    Optional<Url> findById(Long id);

    void deleteById(Long id);

    List<Url> findAll();
}
