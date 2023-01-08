package com.seanrw.todobackend.exceptions;

// Failed login, either username or password
public class LoginFailedException extends RuntimeException {

    public LoginFailedException() {
    }

    public LoginFailedException(String arg0) {
        super(arg0);
    }

    public LoginFailedException(Throwable arg0) {
        super(arg0);
    }

    public LoginFailedException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public LoginFailedException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }   
}
