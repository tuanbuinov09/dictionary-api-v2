package com.example.demo.controllers;

@ControllerAdvice
public class EnWordNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(EnWordNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String enWordNotFoundHandler(EnWordNotFoundException ex) {
        return ex.getMessage();
    }
}
