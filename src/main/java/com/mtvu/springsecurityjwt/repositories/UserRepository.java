package com.mtvu.springsecurityjwt.repositories;

import com.mtvu.springsecurityjwt.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInfo, String> {
    Optional<UserInfo> findByUserName(String userName);
}
