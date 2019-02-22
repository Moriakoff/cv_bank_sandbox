package com.cvbank.application.repository;

import com.cvbank.application.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education,Integer> {
}
