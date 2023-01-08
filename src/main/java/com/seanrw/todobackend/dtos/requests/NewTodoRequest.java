package com.seanrw.todobackend.dtos.requests;

public class NewTodoRequest {
    
    private String userId;
    private String body;
    private boolean complete;

    public NewTodoRequest() {
        super();
    }
    
    public NewTodoRequest(String userId, String body, boolean complete) {
        super();
        this.userId = userId;
        this.body = body;
        this.complete = complete;
    }
    
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public boolean isComplete() {
        return complete;
    }
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
