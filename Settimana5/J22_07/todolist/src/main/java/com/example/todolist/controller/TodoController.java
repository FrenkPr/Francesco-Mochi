package com.example.todolist.controller;

import com.example.todolist.model.Todo;
import com.example.todolist.model.Comment;
import com.example.todolist.service.TodoService;
import com.example.todolist.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;
    private final CommentService commentoService;

    @GetMapping
    public List<Todo> getAllTodo() {
        return todoService.findAll();
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable Long id) {
        return todoService.findById(id);
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.save(todo);
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id, @RequestBody Todo modificato) {
        Todo esistente = todoService.findById(id);
        esistente.setDescription(modificato.getDescription());
        esistente.setCompleted(modificato.isCompleted());
        return todoService.save(esistente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTodo(@PathVariable Long id) {
        todoService.delete(id);
        return ResponseEntity.ok("ToDo eliminato");
    }

    // ENDPOINT SPECIFICO: tutti i commenti legati a un ToDo
    @GetMapping("/{id}/commenti")
    public List<Comment> getCommentiByTodo(@PathVariable Long id) {
        return commentoService.findByTodoId(id);
    }
}