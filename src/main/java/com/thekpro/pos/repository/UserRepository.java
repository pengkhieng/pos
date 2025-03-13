package com.thekpro.pos.repository;

import com.thekpro.pos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
