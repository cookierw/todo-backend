package com.seanrw.todobackend.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seanrw.todobackend.models.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    
}
