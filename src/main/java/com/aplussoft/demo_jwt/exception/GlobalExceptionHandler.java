package com.aplussoft.demo_jwt.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UsernameNotFoundException.class)
    public ResponseEntity<String> exceptionHandler(UsernameNotFoundException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
