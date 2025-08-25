package com.aliyesiloz.services;

import com.aliyesiloz.entities.Role;

public interface IRoleService {
    Role createRole(Role role);
    void assignPermissionToRole(String roleName, String permissionName);
}
