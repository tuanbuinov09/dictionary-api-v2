package com.example.demo.controllers;

public class EnWordNotFoundException extends RuntimeException {
    EnWordNotFoundException(Long id) {
        super("Could not find word " + id);
    }
}
