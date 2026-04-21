package com.zutjmx.springboot.nationjpa.services;

import java.util.List;
import java.util.Optional;

import com.zutjmx.springboot.nationjpa.entities.Region;

public interface RegionService {
    List<Region> findAllRegions();
    Optional<Region> findRegionById(Long id);
    Region saveRegion(Region region);
    Region updateRegion(Long id, Region region);
    void deleteRegionById(Long id);
}
