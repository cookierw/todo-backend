package com.seanrw.todobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.seanrw.todobackend.dtos.requests.NewUserRequest;
import com.seanrw.todobackend.services.UserService;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;
    
    @PostMapping("/auth")
    @ResponseStatus(code = HttpStatus.CREATED, reason = "CREATED")
    public void signup(@RequestBody NewUserRequest req) {
        userService.signup(req);
    }
}
