package com.security.securityProject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos")
public class TodoController
{
    @GetMapping
    public String test()
    {
        return "Lista Todo!";
    }
}