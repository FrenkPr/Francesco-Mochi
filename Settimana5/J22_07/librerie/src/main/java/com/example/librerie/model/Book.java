package com.example.librerie.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor

@Entity //sets the "Book" class as a table
public class Book
{
    //declaring instance variables

    @Id //sets the "id" attribute as a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment option
    private Long id;

    @Nonnull
    private String title;
    
    @Nonnull
    private String author;

    @Nonnull
    private double price;

    //constructor method
    public Book(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}


// @Entity //aligns the "Todo" class is a table
// public class Todo
// {
//     @Id //aligns the "id" attribute is a primary key
//     @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment option
//     private Long id;

//     private String descrizione;

//     private boolean completato;

//     //constructor method
//     public Todo(String descrizione, boolean completato)
//     {
//         this.descrizione = descrizione;
//         this.completato = completato;
//     }
// }