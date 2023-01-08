package com.seanrw.todobackend.models;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todos")
public class Todo {

    @Id
    private String id;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(nullable = false)
    private String body;
    
    @Column(nullable = false)
    private boolean complete;

    public Todo() {
        super();
    }

    public Todo(String text, boolean complete) {
        super();
        this.id = UUID.randomUUID().toString();
        this.body = text;
        this.complete = complete;
    }

    public String getId() {
        return this.id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String text) {
        this.body = text;
    }

    public boolean getComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return String.format(
            "Todo: [id = %i, text = %s, complete = %b]", 
            id, body, complete
        );
    }
}
