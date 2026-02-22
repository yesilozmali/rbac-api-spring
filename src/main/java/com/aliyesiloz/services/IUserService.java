package com.aliyesiloz.services;

import com.aliyesiloz.entities.User;
import java.util.List;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    User updateUser(Long id, User user);

    Optional<User> getUserById(Long id);

    Optional<User> getUserByUsername(String username);

    List<User> getAllUsers();

    void deleteUser(Long id);
}
