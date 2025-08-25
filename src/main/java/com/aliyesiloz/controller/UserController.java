package com.aliyesiloz.controller;

import com.aliyesiloz.entities.User;
import com.aliyesiloz.services.IUserService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    // Yeni kullanıcı oluştur
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // Kullanıcıya rol ata
    @PostMapping("/{username}/roles/{roleName}")
    public String assignRoleToUser(@PathVariable String username, @PathVariable String roleName) {
        userService.assignRoleToUser(username, roleName);
        return "Role assigned successfully!";
    }
 // Tüm kullanıcıları listele
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // ID'ye göre kullanıcı getir
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    
}
