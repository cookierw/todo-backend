package com.seanrw.models;

import java.util.Random;

public class Todo {
    
    private final Random random = new Random();

    private long id;
    private String text;
    private String complete;

    public Todo(String text, String isComplete) {
        this.id = random.nextLong();
        this.text = text;
        this.complete = isComplete;
    }

    public long getId() {
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
}
