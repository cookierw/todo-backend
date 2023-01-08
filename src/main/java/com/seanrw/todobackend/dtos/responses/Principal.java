package com.seanrw.todobackend.dtos.responses;

public class Principal {
    
    private Long id;
    private String username;
    private String token;

    public Principal() {
        super();
    }

    public Principal(Long id, String username) {
        super();
        this.id = id;
        this.username = username;
    }

    public Principal(Long id, String username, String token) {
        this.id = id;
        this.username = username;
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return String.format(
            "Principal: [id: %i, username: %s, token: %s]",
            id, username, token
        );
    }
}
