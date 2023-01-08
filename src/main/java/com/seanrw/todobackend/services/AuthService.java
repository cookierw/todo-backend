package com.seanrw.todobackend.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.seanrw.todobackend.dtos.responses.Principal;
import com.seanrw.todobackend.util.JwtConfig;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class AuthService {
    
    @Autowired
    private JwtConfig config;

    public String generate(Principal sub) {
        long now = System.currentTimeMillis();
        
        return Jwts.builder()
            .setId(sub.getId().toString())
            .setIssuer("todobackend")
            .setIssuedAt(new Date(now))
            .setExpiration(new Date(now + config.getExpiration()))
            .signWith(config.getAlgorithm(), config.getKey())
            .compact();
    }

    public Principal extractRequesterDetails(String token) {
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(config.getKey())
                    .parseClaimsJws(token)
                    .getBody();
            return new Principal(claims.getId(), claims.getSubject());
        } catch (Exception e) {
            return null;
        }
    }
}
