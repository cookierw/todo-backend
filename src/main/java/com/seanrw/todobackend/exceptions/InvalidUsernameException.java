package com.seanrw.todobackend.exceptions;

// Username exists, username fails constraints, etc
public class InvalidUsernameException extends RuntimeException {

    public InvalidUsernameException() {
    }

    public InvalidUsernameException(String arg0) {
        super(arg0);
    }

    public InvalidUsernameException(Throwable arg0) {
        super(arg0);
    }

    public InvalidUsernameException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public InvalidUsernameException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }
}
