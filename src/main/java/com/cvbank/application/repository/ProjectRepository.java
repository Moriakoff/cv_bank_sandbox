package com.cvbank.application.repository;

import com.cvbank.application.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository <Project, Integer> {
}
