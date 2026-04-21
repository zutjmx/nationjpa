package com.zutjmx.springboot.nationjpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.zutjmx.springboot.nationjpa.entities.Region;

public interface RegionRepository extends CrudRepository<Region, Long> {

}
