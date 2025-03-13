package com.thekpro.pos.entity.dto;

import com.thekpro.pos.entity.Role;
import lombok.Data;

@Data
public class UserDto {
    private String username;
    private String password;
    private Role role;
}
