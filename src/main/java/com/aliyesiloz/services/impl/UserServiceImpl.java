package com.aliyesiloz.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.aliyesiloz.entities.Role;
import com.aliyesiloz.entities.User;
import com.aliyesiloz.repository.RoleRepository;
import com.aliyesiloz.repository.UserRepository;
import com.aliyesiloz.services.IUserService;

import java.util.HashSet;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public User createUser(User user) {
        if (user.getRoles() == null) {
            user.setRoles(new HashSet<>()); // boş set ile başlat
        }
        return userRepository.save(user);
    }

    @Override
    public void assignRoleToUser(String username, String roleName) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Role role = roleRepository.findByName(roleName)
                .orElseThrow(() -> new RuntimeException("Role not found"));

        user.getRoles().add(role);
        userRepository.save(user);
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
