package com.aliyesiloz.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.aliyesiloz.entities.Permission;
import com.aliyesiloz.entities.Role;
import com.aliyesiloz.repository.PermissionRepository;
import com.aliyesiloz.repository.RoleRepository;
import com.aliyesiloz.services.IRoleService;

import java.util.HashSet;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements IRoleService {

    private final RoleRepository roleRepository;
    private final PermissionRepository permissionRepository;

    @Override
    public Role createRole(Role role) {
        if (role.getPermissions() == null) {
            role.setPermissions(new HashSet<>());
        }
        return roleRepository.save(role);
    }

    @Override
    public void assignPermissionToRole(String roleName, String permissionName) {
        Role role = roleRepository.findByName(roleName)
                .orElseThrow(() -> new RuntimeException("Role not found"));

        Permission permission = permissionRepository.findByName(permissionName)
                .orElseThrow(() -> new RuntimeException("Permission not found"));

        role.getPermissions().add(permission);
        roleRepository.save(role);
    }
}
