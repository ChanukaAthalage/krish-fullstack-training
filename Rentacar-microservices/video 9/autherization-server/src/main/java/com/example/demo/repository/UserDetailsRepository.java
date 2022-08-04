package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

import java.util.Optional;

public interface UserDetailsRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String username);
}
