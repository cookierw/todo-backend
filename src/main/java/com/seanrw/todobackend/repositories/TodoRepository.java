package com.seanrw.todobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seanrw.todobackend.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, String> {
    
}
