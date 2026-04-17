package com.zutjmx.springboot.nationjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zutjmx.springboot.nationjpa.entities.Continent;
import com.zutjmx.springboot.nationjpa.services.ContinentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/continents")
public class ContinentController {

    @Autowired
    private ContinentService continentService;

    @GetMapping
    public List<Continent> listar() {
        return continentService.findAllContinents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return continentService.findContinentById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity
        .notFound()
        .build());
    }
    
    
}
