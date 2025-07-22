package com.example.librerie.service;

import com.example.librerie.model.Book;
import com.example.librerie.repository.BookRepository;

import jakarta.annotation.Nonnull;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService
{
    private final BookRepository bookRep;

    public BookService(@Nonnull BookRepository repo)
    {
        bookRep = repo;
    }

    public List<Book> getAll()
    {
        List<Book> bookList = new ArrayList<>();
        bookRep.findAll().forEach(bookList::add);

        return bookList;
    }

    public Optional<Book> getById(@Nonnull Long id)
    {
        return bookRep.findById(id);
    }

    // public Optional<Book> getByFirstTitle(@Nonnull String title)
    // {
    //     return bookRep.
    // }

    public Book create(Book bookToCreate)
    {
        return bookRep.save(bookToCreate);
    }

    public Optional<Book> update(@Nonnull Long id, Book newBook)
    {
        return bookRep.findById(id).map(b ->
        {   
            b.setTitle(newBook.getTitle());
            b.setAuthor(newBook.getAuthor());
            b.setPrice(newBook.getPrice());

            return bookRep.save(b);
        });
    }

    public boolean delete(@Nonnull Long id)
    {
        if (bookRep.existsById(id))
        {
            bookRep.deleteById(id);
            return true;
        }

        return false;
    }

    public boolean deleteAllBooks()
    {
        if(bookRep.count() <= 0)
        {
            return false;
        }

        bookRep.deleteAll();
        return true;
    }
}

// @Service
// public class BookService
// {
//     private final List<Book> books = new ArrayList<>();
//     private Long idCounter = 1L;

//     public List<Book> getAll()
//     {
//         return books;
//     }

//     public Optional<Book> getById(Long id)
//     {
//         return books.stream().filter(t -> t.getId().equals(id)).findFirst();
//     }

//     public Book create(Book nuovo)
//     {
//         nuovo.setId(idCounter++);
//         books.add(nuovo);
//         return nuovo;
//     }

//     public Optional<Book> update(Long id, Book modificato)
//     {
//         return getById(id).map(book -> {
//             book.setAuthor(modificato.getAuthor());
//             book.setPrice(modificato.getPrice());
//             return book;
//         });
//     }

//     public boolean delete(Long id)
//     {
//         return books.removeIf(t -> t.getId().equals(id));
//     }
// }