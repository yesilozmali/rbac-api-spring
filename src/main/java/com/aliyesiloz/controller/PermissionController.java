package com.aliyesiloz.controller;

import com.aliyesiloz.entities.Permission;
import com.aliyesiloz.services.IPermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/permissions")
@RequiredArgsConstructor
public class PermissionController {

    private final IPermissionService permissionService;

    // Yeni permission oluştur
    @PostMapping
    public Permission createPermission(@RequestBody Permission permission) {
        return permissionService.createPermission(permission);
    }
}
