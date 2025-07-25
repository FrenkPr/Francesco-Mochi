package com.example.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.example.security.model.*;
import com.example.security.repository.UtenteRepository;

@RestController
@RequestMapping("/setup")
public class SetupController
{
    @Autowired
    private UtenteRepository repo;
    @Autowired
    private PasswordEncoder encoder;

    @PostMapping("/admin")
    public String creaAdmin()
    {
        if (repo.findByUsername("admin").isEmpty()) {
            Utente u = new Utente();
            u.setUsername("admin");
            u.setPassword(encoder.encode("admin123"));
            u.setRuolo(RuoloUtenteTipo.ADMIN);
            repo.save(u);
        }
        return "Utente admin creato";
    }
}