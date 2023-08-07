package com.codestates.pre_project_test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Todo {

    @GetMapping("/")
    public String HelloWorld() {
        return "To-do Application !";
    }
}
