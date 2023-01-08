package com.seanrw.todobackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seanrw.todobackend.dtos.requests.LoginRequest;
import com.seanrw.todobackend.dtos.requests.NewUserRequest;
import com.seanrw.todobackend.dtos.responses.Principal;
import com.seanrw.todobackend.exceptions.LoginFailedException;
import com.seanrw.todobackend.models.User;
import com.seanrw.todobackend.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;

    public User signup(NewUserRequest req) {
        User user = new User(req.getUsername(), req.getPassword());
        userRepo.save(user);
        return user;
    }

    public Principal login(LoginRequest req) {
        User user = userRepo.findByUsernameAndPassword(req.getUsername(), req.getPassword());
        if (user == null) throw new LoginFailedException("Login Failed");
        return new Principal(user.getId(), user.getUsername());
    }
}
