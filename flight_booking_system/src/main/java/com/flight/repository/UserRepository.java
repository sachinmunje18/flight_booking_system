package com.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    // Fetch by email and password for login
    public User findByEmailAndPassword(String email, String password);
}
