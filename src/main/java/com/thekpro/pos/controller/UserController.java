package com.thekpro.pos.controller;

import com.thekpro.pos.entity.User;
import com.thekpro.pos.entity.dto.UserDto;
import com.thekpro.pos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserDto userDto) {
        if (userDto.getPassword() == null || userDto.getPassword().isEmpty()) {
            return ResponseEntity.badRequest().body(null);
        }
        User savedUser = userService.save(userDto);
        return ResponseEntity.ok(savedUser);
    }



    @GetMapping()
    public ResponseEntity<List<User>> get() {
        return ResponseEntity.ok(userService.findAll());
    }
}
