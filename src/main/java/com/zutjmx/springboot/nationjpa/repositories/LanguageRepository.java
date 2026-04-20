package com.zutjmx.springboot.nationjpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.zutjmx.springboot.nationjpa.entities.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {

}
