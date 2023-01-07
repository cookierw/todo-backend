package com.seanrw.todobackend.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seanrw.models.Todo;
import com.seanrw.todobackend.repositories.TodoRepository;

@Service
public class TodoService {
    
    @Autowired
    private TodoRepository todoRepo;

    public List<Todo> getTodos() {
        return todoRepo.findAll();
    }

    public Todo getTodoById(UUID id) {
        return todoRepo.findTodoById(id);
    }

    public Todo addOrUpdate(Todo todo) {
        return todoRepo.save(todo);
    }

    public void destroyTodo(UUID id) {
        Todo todo = getTodoById(id);
        todoRepo.delete(id);
    }
}
