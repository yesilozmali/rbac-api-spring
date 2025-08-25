package com.aliyesiloz.services;

import java.util.List;

import com.aliyesiloz.entities.User;

public interface IUserService {
    User createUser(User user);
    void assignRoleToUser(String username, String roleName);
    
    List<User> getAllUsers();   // yeni
    User getUserById(Long id);  // yeni
}
