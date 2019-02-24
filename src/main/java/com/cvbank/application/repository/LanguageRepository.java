package com.cvbank.application.repository;

import com.cvbank.application.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository <Language, Integer> {
}
