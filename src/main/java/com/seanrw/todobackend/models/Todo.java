package com.seanrw.todobackend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String body;
    @Column(columnDefinition = "BOOLEAN", nullable = false)
    private boolean complete;

    public Todo(String text, boolean complete) {
        this.body = text;
        this.complete = complete;
    }

    public int getId() {
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
