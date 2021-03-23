package com.sbs.mobilebank.repositories;

import com.sbs.mobilebank.entities.UserEntity;
import com.sbs.mobilebank.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Djaitai Koffi
 */

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUserEmail(String userEmail);
    UserEntity findByUserCode(String userCode);
}
