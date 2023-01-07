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
    private String text;
    @Column(nullable = false)
    private String complete;

    public Todo(String text, String isComplete) {
        this.text = text;
        this.complete = isComplete;
    }

    public int getId() {
        return this.id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return String.format(
            "Todo: [id = %i, text = %s, complete = %b]", 
            id, text, complete
        );
    }
}
