package com.example.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

// /admin/pannello → accesso solo ADMIN
@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/pannello")
    public String pannelloAdmin(Authentication auth) {
        return "Benvenuto " + auth.getName() + ", sei un ADMIN.";
    }
}