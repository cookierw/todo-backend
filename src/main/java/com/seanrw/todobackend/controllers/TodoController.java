package com.seanrw.todobackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.seanrw.todobackend.dtos.requests.NewTodoRequest;
import com.seanrw.todobackend.dtos.responses.Principal;
import com.seanrw.todobackend.exceptions.UnauthorizedException;
import com.seanrw.todobackend.models.Todo;
import com.seanrw.todobackend.services.AuthService;
import com.seanrw.todobackend.services.TodoService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @Autowired
    private AuthService authService;
    
    @GetMapping
    public List<Todo> getTodos(HttpServletRequest req) {
        return todoService.getTodos(checkAuthorization(req).getId());
    }

    @GetMapping("{id}")
    public Todo getTodoById(@PathVariable String id, HttpServletRequest req) {
        checkAuthorization(req);
        return todoService.getTodoById(id);
    }

    @PostMapping
    public Todo addTodo(@RequestBody NewTodoRequest todo, HttpServletRequest req) {
        checkAuthorization(req);
        return todoService.addOrUpdate(new Todo(todo.getUserId(), todo.getBody(), todo.isComplete()));
    }

    @PutMapping
    public Todo updateTodo(@RequestBody Todo todo, HttpServletRequest req) {
        checkAuthorization(req);
        return todoService.addOrUpdate(todo);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteTodo(@PathVariable String id, HttpServletRequest req) {
        checkAuthorization(req);
        todoService.destroyTodo(id);
    }

    private Principal checkAuthorization(HttpServletRequest req) throws UnauthorizedException {
        String token = req.getHeader("authorization");
        if (token == null || token.isEmpty()) throw new UnauthorizedException("Invalid token.");

        Principal principal = authService.extractRequesterDetails(token);
        if (principal == null) throw new UnauthorizedException("Please sign in to view todos.");

        return principal;
    }
}
