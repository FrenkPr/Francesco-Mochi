package com.example.security.service;

import com.example.security.model.Utente;
import com.example.security.repository.UtenteRepository;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UtenteRepository repo;

    public CustomUserDetailsService(UtenteRepository repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Utente u = repo.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Utente non trovato"));

        return User.builder()
                .username(u.getUsername())
                .password(u.getPassword())
                .roles(u.getRuolo().toString()) // es. "USER"
                .build();
    }
}