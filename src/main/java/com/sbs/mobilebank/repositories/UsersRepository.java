package com.sbs.mobilebank.repositories;

import com.sbs.mobilebank.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findUserByUsername(String username);
    Users findUserByEmail(String email);
}
