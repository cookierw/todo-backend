package com.seanrw.todobackend.util;

import java.security.Key;

import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtConfig {
    
    private final SignatureAlgorithm algorithm = SignatureAlgorithm.HS256;
    private final Key key;
    
    public JwtConfig(@Value("${SALT}") String salt) {
        System.out.println(salt);
        byte[] saltBytes = salt.getBytes();
        this.key = new SecretKeySpec(saltBytes, algorithm.getJcaName());
    }
    
    public int getExpiration() {
        return 60 * 60 * 100;
    }

    public SignatureAlgorithm getAlgorithm() {
        return algorithm;
    }

    public Key getKey() {
        return key;
    }
}