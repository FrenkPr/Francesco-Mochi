package com.example.librerie.repository;

import com.example.librerie.model.Book;
import org.springframework.data.jpa.repository.JpaRepository; //JpaRepository extends CrudRepository class
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>
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