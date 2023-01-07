package com.seanrw.todobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seanrw.todobackend.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
