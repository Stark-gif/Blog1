package com.blog1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CreateException extends RuntimeException{

    private String message;

    public CreateException(String message) {
super(message);

    }
}
