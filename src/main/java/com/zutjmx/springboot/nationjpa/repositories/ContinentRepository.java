package com.zutjmx.springboot.nationjpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.zutjmx.springboot.nationjpa.entities.Continent;

public interface ContinentRepository extends CrudRepository<Continent, Long> {

}
