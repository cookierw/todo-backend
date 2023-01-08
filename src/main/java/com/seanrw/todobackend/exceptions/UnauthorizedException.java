package com.seanrw.todobackend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Not logged in
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends RuntimeException {

    public UnauthorizedException() {
    }

    public UnauthorizedException(String arg0) {
        super(arg0);
    }

    public UnauthorizedException(Throwable arg0) {
        super(arg0);
    }

    public UnauthorizedException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public UnauthorizedException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }
}
