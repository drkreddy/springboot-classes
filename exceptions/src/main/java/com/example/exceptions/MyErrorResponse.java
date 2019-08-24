package com.example.exceptions;

import org.springframework.http.HttpStatus;

public class MyErrorResponse {
    HttpStatus status;
    String message;

    public MyErrorResponse(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public MyErrorResponse() {
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
