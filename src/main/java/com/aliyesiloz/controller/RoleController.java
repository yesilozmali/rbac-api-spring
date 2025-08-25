package com.aliyesiloz.controller;

import com.aliyesiloz.entities.Role;
import com.aliyesiloz.services.IRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/roles")
@RequiredArgsConstructor
public class RoleController {

    private final IRoleService roleService;

    // Yeni rol oluştur
    @PostMapping
    public Role createRole(@RequestBody Role role) {
        return roleService.createRole(role);
    }

    // Role permission ata
    @PostMapping("/{roleName}/permissions/{permissionName}")
    public String assignPermissionToRole(@PathVariable String roleName, @PathVariable String permissionName) {
        roleService.assignPermissionToRole(roleName, permissionName);
        return "Permission assigned to role successfully!";
    }
}
