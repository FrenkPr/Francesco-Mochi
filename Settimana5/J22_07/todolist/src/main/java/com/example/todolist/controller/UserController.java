package com.example.todolist.controller;

import com.example.todolist.model.User;
import com.example.todolist.service.UserService;
import com.example.todolist.service.TodoService;
import com.example.todolist.model.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utenti")
@RequiredArgsConstructor
public class UserController
{
    private final UserService utenteService;
    private final TodoService todoService;

    @GetMapping
    public List<User> getAllUtenti() {
        return utenteService.findAll();
    }

    @GetMapping("/{id}")
    public User getUtenteById(@PathVariable Long id) {
        return utenteService.findById(id);
    }

    @PostMapping
    public User createUtente(@RequestBody User utente) {
        return utenteService.save(utente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUtente(@PathVariable Long id) {
        utenteService.delete(id);
        return ResponseEntity.ok("Utente eliminato");
    }

    // ENDPOINT SPECIFICO: tutti i ToDo di un utente
    @GetMapping("/{id}/todo")
    public List<Todo> getTodoByUtente(@PathVariable Long id) {
        return todoService.findByUtenteId(id);
    }
}