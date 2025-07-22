package com.example.todolist.controller;

import com.example.todolist.model.Comment;
import com.example.todolist.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commenti")
@RequiredArgsConstructor
public class CommentController
{
    private final CommentService commentoService;

    @GetMapping
    public List<Comment> getAllCommenti() {
        return commentoService.findAll();
    }

    @GetMapping("/{id}")
    public Comment getCommentoById(@PathVariable Long id) {
        return commentoService.findById(id);
    }

    @PostMapping
    public Comment createCommento(@RequestBody Comment commento) {
        return commentoService.save(commento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCommento(@PathVariable Long id) {
        commentoService.delete(id);
        return ResponseEntity.ok("Commento eliminato");
    }
}