package com.seanrw.todobackend.exceptions;

// Password fails constraints
public class InvalidPasswordException extends RuntimeException {

    public InvalidPasswordException() {
    }

    public InvalidPasswordException(String arg0) {
        super(arg0);
    }

    public InvalidPasswordException(Throwable arg0) {
        super(arg0);
    }

    public InvalidPasswordException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public InvalidPasswordException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }
}
