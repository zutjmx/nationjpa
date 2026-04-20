package com.zutjmx.springboot.nationjpa.services;

import java.util.List;
import java.util.Optional;

import com.zutjmx.springboot.nationjpa.entities.Language;

public interface LanguageService {
    List<Language> getAllLanguages();
    Optional<Language> getLanguageById(Long id);
    Language saveLanguage(Language language);
    void deleteLanguage(Long id);
}
