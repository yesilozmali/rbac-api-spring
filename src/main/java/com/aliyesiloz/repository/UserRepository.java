package com.aliyesiloz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aliyesiloz.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
