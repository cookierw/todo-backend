package com.seanrw.models;

import java.util.UUID;

public class Todo {

    private UUID id;
    private String text;
    private String complete;

    public Todo(String text, String isComplete) {
        this.id = UUID.randomUUID();
        this.text = text;
        this.complete = isComplete;
    }

    public UUID getId() {
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
