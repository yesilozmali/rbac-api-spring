package com.aliyesiloz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aliyesiloz.entities.Permission;

import java.util.Optional;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
    Optional<Permission> findByName(String name);
}
