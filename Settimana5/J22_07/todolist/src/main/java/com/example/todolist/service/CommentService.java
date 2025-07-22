package com.example.todolist.service;

import com.example.todolist.model.Comment;
import com.example.todolist.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService
{
    private final CommentRepository commentoRepository;

    public List<Comment> findAll() {
        return commentoRepository.findAll();
    }

    public List<Comment> findByTodoId(Long todoId) {
        return commentoRepository.findByTodoId(todoId);
    }

    public Comment findById(Long id) {
        return commentoRepository.findById(id).orElseThrow(() -> new RuntimeException("Commento non trovato"));
    }

    public Comment save(Comment commento) {
        return commentoRepository.save(commento);
    }

    public void delete(Long id) {
        commentoRepository.deleteById(id);
    }
}