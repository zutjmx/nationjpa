package com.zutjmx.springboot.nationjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zutjmx.springboot.nationjpa.entities.Language;
import com.zutjmx.springboot.nationjpa.repositories.LanguageRepository;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    @Override
    public List<Language> getAllLanguages() {
        return (List<Language>) languageRepository.findAll();        
    }

    @Override
    public Optional<Language> getLanguageById(Long id) {
        return languageRepository.findById(id);
    }

    @Override
    public Language saveLanguage(Language language) {
        return languageRepository.save(language);
    }

    @Override
    public void deleteLanguage(Long id) {
        Optional<Language> languageOpt = languageRepository.findById(id);
        if (languageOpt.isPresent()) {
            languageRepository.delete(languageOpt.get());
        } else {
            throw new RuntimeException("Language not found with id: " + id);
        }
    }

}
