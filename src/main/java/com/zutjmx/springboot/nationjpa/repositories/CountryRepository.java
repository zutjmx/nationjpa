package com.zutjmx.springboot.nationjpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.zutjmx.springboot.nationjpa.entities.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {

}
