package com.thekpro.pos.service;

import com.thekpro.pos.entity.User;
import com.thekpro.pos.entity.dto.UserDto;

import java.util.List;

public interface UserService {
    User save(UserDto userDto);
    List<User> findAll();
}
