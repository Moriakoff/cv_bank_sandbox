package com.cvbank.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvbank.application.entity.CV;

public interface CvRepository extends JpaRepository<CV, Integer> {

}
