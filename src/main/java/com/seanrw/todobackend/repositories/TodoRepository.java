package com.seanrw.todobackend.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seanrw.models.Todo;

@Repository
public class TodoRepository {
    
    private List<Todo> todos;

    public TodoRepository() {
        this.todos = new ArrayList<>();
    }

    public List<Todo> findAll() {
        return this.todos;
    }

    public Todo findTodoById(long id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) return todo;
        }

        return null;
    }

    public Todo save(Todo todo) {
        this.todos.add(todo);
        return todo;
    }

    public void delete(long id) {
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getId() == id) {
                todos.remove(i);
                return;
            }
        }
    }
}
