package com.cvbank.application.repository;

import com.cvbank.application.entity.Certification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificationRepository extends JpaRepository<Certification,Integer> {
}
