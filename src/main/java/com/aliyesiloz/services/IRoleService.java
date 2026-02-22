package com.aliyesiloz.services;

import com.aliyesiloz.entities.Role;
import java.util.List;

public interface IRoleService {
    Role saveRole(Role role);
    Role updateRole(Long id, Role role);
    Role getRoleById(Long id);
    Role getRoleByName(String name);
    List<Role> getAllRoles();
    void deleteRole(Long id);
}
