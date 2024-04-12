package com.spring.boot.controller;

import com.spring.boot.dto.resquest.UserCreationRequest;
import com.spring.boot.dto.resquest.UserUpdateRequest;
import com.spring.boot.entity.User;
import com.spring.boot.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public ResponseEntity<?> createUser(@RequestBody @Valid UserCreationRequest request) {
        return ResponseEntity.ok(userService.createRequest(request));
    }

    @GetMapping("")
    public ResponseEntity<?> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    
    @GetMapping("/{userId}")
    User getUsers(@PathVariable("userId") String userId) {
        return userService.getUserById(userId);
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable("userId") String userId, @RequestBody UserUpdateRequest request) {
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable("userId") String userId) {
        userService.deleteUser(userId);
        return "User has been deleted";
    }

}
