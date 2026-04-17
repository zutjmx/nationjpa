package com.zutjmx.springboot.nationjpa.services;

import java.util.List;
import java.util.Optional;

import com.zutjmx.springboot.nationjpa.entities.Continent;

public interface ContinentService {
    List<Continent> findAllContinents();    
    public Optional<Continent> findContinentById(Long id);
    public Continent saveContinent(Continent continent);
    Continent updateContinent(Long id, Continent continent);
    public Continent findContinentByName(String name);
    void deleteContinentById(Long id);
}
