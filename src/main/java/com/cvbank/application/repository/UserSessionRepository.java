package com.cvbank.application.repository;

import com.cvbank.application.entity.User;
import com.cvbank.application.entity.UserSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSessionRepository extends JpaRepository<UserSession, Integer> {
	 User findUserByToken(String token);
	
}
