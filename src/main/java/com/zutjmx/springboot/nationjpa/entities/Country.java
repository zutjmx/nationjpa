package com.zutjmx.springboot.nationjpa.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
    private Date nationalDay;
    
    @Column(name = "country_code1")
    private String countryCode1;
    
    @Column(name = "country_code2")
    private String countryCode2;
    
    @Column(name = "region_id")
    private Long regionId;

    public Country() {
    }

    public Country(
        Long id, 
        String name, 
        Double area, 
        Date nationalDay, 
        String countryCode1, 
        String countryCode2,
        Long regionId
    ) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.nationalDay = nationalDay;
        this.countryCode1 = countryCode1;
        this.countryCode2 = countryCode2;
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

    public Date getNationalDay() {
        return nationalDay;
    }

    public void setNationalDay(Date nationalDay) {
        this.nationalDay = nationalDay;
    }

    public String getCountryCode1() {
        return countryCode1;
    }

    public void setCountryCode1(String countryCode1) {
        this.countryCode1 = countryCode1;
    }

    public String getCountryCode2() {
        return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

}
