package com.example.todolist.model;

import jakarta.persistence.*;
import lombok.*;

@Entity //sets the "Todo" class as a table
@Data //getter and setter for each attribute
@NoArgsConstructor //empty constructor
@AllArgsConstructor //constructor with all params
@Builder
@Table(name = "todo")
public class Todo
{
    @Id //sets the "id" attribute as a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment option
    private Long id;

    @Column(nullable = false)
    private String description;

    private boolean completed;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private User user;
}


// @Data //getter and setter for each attribute
// @NoArgsConstructor //empty constructor
// // @AllArgsConstructor //constructor with params

// @Entity //sets the "Todo" class as a table
// public class Todo
// {
//     @Id //sets the "id" attribute as a primary key
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