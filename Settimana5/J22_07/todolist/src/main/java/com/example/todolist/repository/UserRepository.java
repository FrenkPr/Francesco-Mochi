package com.example.todolist.repository;

import com.example.todolist.model.User;
import org.springframework.data.jpa.repository.JpaRepository; //JpaRepository extends CrudRepository class

public interface UserRepository extends JpaRepository<User, Long>
{
    // Tutti i metodi CRUD già pronti!
    //findById
    //findAllById
    //save  creates and updates values
    //saveAll
    //deleteById
    //delete
    //existsById
}