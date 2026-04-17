package com.zutjmx.springboot.nationjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zutjmx.springboot.nationjpa.entities.Continent;
import com.zutjmx.springboot.nationjpa.repositories.ContinentRepository;

@Service
public class ContinentServiceImpl implements ContinentService {

    @Autowired
    private ContinentRepository continentRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Continent> findAllContinents() {
        return (List<Continent>) continentRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Continent> findContinentById(Long id) {
        return continentRepository.findById(id);
    }

    @Transactional
    @Override
    public Continent saveContinent(Continent continent) {        
        return continentRepository.save(continent);
    }

    @Override
    public Continent updateContinent(Long id, Continent continent) {        
        Optional<Continent> optionalContinent = continentRepository.findById(id);
        if (optionalContinent.isPresent()) {
            Continent existingContinent = optionalContinent.get();
            existingContinent.setName(continent.getName());
            return continentRepository.save(existingContinent);
        } else {
            throw new RuntimeException("Continent not found with id: " + id);
        }
    }

    @Override
    public Continent findContinentByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findContinentByName'");
    }

    @Override
    public void deleteContinentById(Long id) {
        Optional<Continent> optionalContinent = continentRepository.findById(id);
        if (!optionalContinent.isPresent()) {
            throw new RuntimeException("Continent not found with id: " + id);
        }
        continentRepository.deleteById(id);
    }

}
