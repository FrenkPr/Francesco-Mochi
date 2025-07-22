package com.example.todolist.repository;

import com.example.todolist.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long>
{
    List<Comment> findByTodoId(Long todoId);
}