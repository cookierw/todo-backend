package com.seanrw.todobackend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Username exists, username fails constraints, etc
@ResponseStatus(HttpStatus.UNAUTHORIZED)
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
