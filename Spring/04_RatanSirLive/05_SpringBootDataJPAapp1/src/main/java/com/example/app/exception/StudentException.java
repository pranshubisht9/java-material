package com.example.app.exception;

public class StudentException extends RuntimeException{
    public StudentException() {
    }

    public StudentException(String message) {
        super(message);
    }
}
