package com.aliyesiloz.services.impl;

import com.aliyesiloz.entities.Permission;
import com.aliyesiloz.repository.PermissionRepository;
import com.aliyesiloz.services.IPermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements IPermissionService {

    private final PermissionRepository permissionRepository;

    @Override
    public Permission createPermission(Permission permission) {
        return permissionRepository.save(permission);
    }
}
