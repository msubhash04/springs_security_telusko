package com.springsecurity.telusko.repository;

import com.springsecurity.telusko.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
//    Users findByUserName(String username);
    Users findByUsername(String username);
}
