package com.crud.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class UserController {
    private UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/admin-users")
    public Collection<User> adminUsers() {
        return repository.findAll().stream()
                .filter(this::isAdmin)
                .collect(Collectors.toList());
    }
    private boolean isAdmin(User user) {
        return !user.getName().equals("User_1") &&
               !user.getName().equals("User_2") &&
               !user.getName().equals("User_3") &&
               !user.getName().equals("User_4");
    }
}
