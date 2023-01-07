package com.seanrw.todobackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seanrw.todobackend.models.Todo;
import com.seanrw.todobackend.repositories.TodoRepository;

@Service
public class TodoService {
    
    @Autowired
    private TodoRepository todoRepo;

    public List<Todo> getTodos() {
        return todoRepo.findAll();
    }

    public Todo getTodoById(int id) {
        Optional<Todo> todo = todoRepo.findById(id);
        if (todo.isPresent()) {
            return todo.get();
        }

        return null;
    }

    public Todo addOrUpdate(Todo todo) {
        return todoRepo.save(todo);
    }

    public void destroyTodo(int id) {
        Todo todo = getTodoById(id);
        todoRepo.deleteById(id);
    }
}
