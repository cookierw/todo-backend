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

    public List<Todo> findAllTodos() {
        return this.todos;
    }

    public Todo findTodoById(long id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) return todo;
        }

        return null;
    }

    public boolean addTodo(Todo todo) {
        this.todos.add(todo);
        return true;
    }
}
