package com.api.estoquecerveja.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.estoquecerveja.entity.Beer;

/***
 * 
 * @author dionatan
 *
 */

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}

