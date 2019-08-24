package com.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;

@RestControllerAdvice
public class MyRestControllerAdvice {

    @ExceptionHandler(IOException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MyErrorResponse badRequest(IOException e){
        return new MyErrorResponse(HttpStatus.BAD_GATEWAY,e.getMessage()+"---------RestContoller");
    }

}
