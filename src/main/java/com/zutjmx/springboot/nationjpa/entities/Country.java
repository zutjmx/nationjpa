package com.zutjmx.springboot.nationjpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
    
    @Id
    @Column(name = "country_id")
    private Long id;

    private String name;
    
    private Double area;
    
    @Column(name = "national_day")
    private String nationalDay;
    
    @Column(name = "country_code2")
    private String countryCode2;
    
    @Column(name = "country_code3")
    private String countryCode3;
    
    @Column(name = "region_id")
    private Long regionId;

    public Country() {
    }

    public Country(
        Long id, 
        String name, 
        Double area, 
        String nationalDay, 
        String countryCode2, 
        String countryCode3,
        Long regionId
    ) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.nationalDay = nationalDay;
        this.countryCode2 = countryCode2;
        this.countryCode3 = countryCode3;
        this.regionId = regionId;
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

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getNationalDay() {
        return nationalDay;
    }

    public void setNationalDay(String nationalDay) {
        this.nationalDay = nationalDay;
    }

    public String getCountryCode2() {
        return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public String getCountryCode3() {
        return countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

}
