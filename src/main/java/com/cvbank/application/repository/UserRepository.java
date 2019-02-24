package com.cvbank.application.repository;

import com.cvbank.application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findUserByEmail(String email);

    boolean existsByEmail(String email);
}
