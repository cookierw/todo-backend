package com.seanrw.todobackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.seanrw.todobackend.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, String> {
    
    @Query(value = "SELECT * FROM todos WHERE user_id = ?1", nativeQuery = true)
    List<Todo> findTodosByUserId(String id);
}
