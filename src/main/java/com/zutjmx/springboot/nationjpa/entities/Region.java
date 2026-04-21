package com.zutjmx.springboot.nationjpa.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "regions")
public class Region {
    @Id
    @Column(name = "region_id")
    private Long id;

    private String name;

    @Column(name = "continent_id")
    private Long continentId;

    public Region() {
        
    }

    public Region(Long id, String name, Long continentId) {
        this.id = id;
        this.name = name;
        this.continentId = continentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getContinentId() {
        return continentId;
    }

    public void setContinentId(Long continentId) {
        this.continentId = continentId;
    }

}
