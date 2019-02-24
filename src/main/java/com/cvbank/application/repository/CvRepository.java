package com.cvbank.application.repository;

import com.cvbank.application.entity.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvRepository extends JpaRepository <Cv, Integer> {
}
