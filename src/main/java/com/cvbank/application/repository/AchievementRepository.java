package com.cvbank.application.repository;

import com.cvbank.application.entity.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AchievementRepository extends JpaRepository<Achievement,Integer> {
}
