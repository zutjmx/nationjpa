package com.zutjmx.springboot.nationjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zutjmx.springboot.nationjpa.entities.Region;
import com.zutjmx.springboot.nationjpa.repositories.RegionRepository;

@Service
public class RegionServiceImpl implements RegionService {
    
    @Autowired
    private RegionRepository regionRepository;
    
    @Override
    public List<Region> findAllRegions() {
        return (List<Region>) regionRepository.findAll();
    }

    @Override
    public Optional<Region> findRegionById(Long id) {
        return regionRepository.findById(id);
    }

    @Override
    public Region saveRegion(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public Region updateRegion(Long id, Region region) {
        Optional<Region> existingRegion = regionRepository.findById(id);
        if (existingRegion.isPresent()) {
            Region updatedRegion = existingRegion.get();
            updatedRegion.setName(region.getName());
            //updatedRegion.setCountries(region.getCountries());
            return regionRepository.save(updatedRegion);
        } else {
            throw new RuntimeException("Region not found with id: " + id);
        }
    }

    @Override
    public void deleteRegionById(Long id) {
        Optional<Region> existingRegion = regionRepository.findById(id);
        if (!existingRegion.isPresent()) {
            throw new RuntimeException("Region not found with id: " + id);
        }
        regionRepository.deleteById(id);
    }

}
