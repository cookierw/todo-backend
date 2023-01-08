package com.seanrw.todobackend.dtos.requests;

public class NewUserRequest {
    
    private String username;
    private String password;
    
    public NewUserRequest() {
        super();
    }

    public NewUserRequest(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format(
            "NewUserRequest: [username: %s, password(hash): %s]",
            username, password            
        );
    }
}
