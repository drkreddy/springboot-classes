package com.example.exceptions;

public class MyOwnException extends Exception {
    public MyOwnException() {
        super();
    }

    public MyOwnException(String message) {
        super(message);
    }
}
