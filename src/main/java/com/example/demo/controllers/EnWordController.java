package com.example.demo.controllers;

import com.example.demo.controllers.entities.EnWord;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EnWordController {

    public EnWordController() {

    }

    @GetMapping("/enwords")
    public List<EnWord> all() {
        return null;
    }

    @PostMapping("/enwords")
    public EnWord newEnword(@RequestBody EnWord newEnword) {
        return null;
    }

//    @GetMapping("/enwords/{id}")
//    EnWord one(@PathVariable Long id) {
//
//        return repository.findById(id)
//                .orElseThrow(() -> new EmployeeNotFoundException(id));
//    }

//    @PutMapping("/enwords/{id}")
//    EnWord replaceEmployee(@RequestBody EnWord newEnWord, @PathVariable Long id) {
//
//        return repository.findById(id)
//                .map(employee -> {
//                    newEnWord.setName(newEnWord.getName());
//                    newEnWord.setRole(newEnWord.getRole());
//                    return repository.save(employee);
//                })
//                .orElseGet(() -> {
//                    newEnWord.setId(id);
//                    return repository.save(newEnWord);
//                });
//    }

    @DeleteMapping("/enwords/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
