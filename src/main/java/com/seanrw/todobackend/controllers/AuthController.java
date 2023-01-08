package com.seanrw.todobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.seanrw.todobackend.dtos.requests.LoginRequest;
import com.seanrw.todobackend.dtos.requests.NewUserRequest;
import com.seanrw.todobackend.dtos.responses.Principal;
import com.seanrw.todobackend.services.AuthService;
import com.seanrw.todobackend.services.UserService;
import com.seanrw.todobackend.util.JwtConfig;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthService authService;
    
    @PostMapping("/signup")
    @ResponseStatus(code = HttpStatus.CREATED, reason = "CREATED")
    public void signup(@RequestBody NewUserRequest req) {
        userService.signup(req);
    }

    @PostMapping("/auth")
    public Principal login(@RequestBody LoginRequest req) {
        Principal principal = userService.login(req);
        principal.setToken(authService.generate(principal));
        return principal;
    }
}
