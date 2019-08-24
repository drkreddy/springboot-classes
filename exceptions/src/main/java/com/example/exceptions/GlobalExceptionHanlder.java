package com.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

@ControllerAdvice
public class GlobalExceptionHanlder {
    @org.springframework.web.bind.annotation.ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> rr(RuntimeException e){
		return new ResponseEntity(e.getMessage()+"---Controller Advice", HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(IOException.class)
	public ResponseEntity<MyErrorResponse> error(Exception e){
//ResponseEntity.badRequest().body(MyErrorResponse)
	return new ResponseEntity<MyErrorResponse>(new MyErrorResponse(HttpStatus.BAD_REQUEST,e.getMessage()),HttpStatus.BAD_REQUEST);
	}
}


