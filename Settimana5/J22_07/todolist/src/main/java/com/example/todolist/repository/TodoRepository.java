package com.example.todolist.repository;

import com.example.todolist.model.Todo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository; //JpaRepository extends CrudRepository class
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>
{
    // Tutti i metodi CRUD già pronti!
    //findById
    //findAllById
    //save  creates and updates values
    //saveAll
    //deleteById
    //delete
    //existsById

    List<Todo> findByUtenteId(Long utenteId);
}