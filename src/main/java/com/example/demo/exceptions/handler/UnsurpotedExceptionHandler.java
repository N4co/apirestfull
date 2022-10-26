package com.example.demo.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsurpotedExceptionHandler extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L;
    public UnsurpotedExceptionHandler (String ex) {
        super (ex);

    }


}
