package com.zutjmx.springboot.nationjpa.services;

import java.util.List;
import java.util.Optional;

import com.zutjmx.springboot.nationjpa.entities.Country;

public interface CountryService {
    List<Country> findAllCountries();
    Optional<Country> findCountryById(Long id);
}
