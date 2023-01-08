package com.seanrw.todobackend.models;

// import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GenericGenerator(name = "hilo_strategy", strategy = "hilo")
    @GeneratedValue(generator = "hilo-strategy")
    private String id;

    private String username;

    private String password;
    
    public User() {
        super();
    }

    public User(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
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
    
    // TODO: implement userId property/field on Todo/todos
    // @OneToMany()
    // private List<Todo> todos;
}
