package com.example.springbootwithmongo.springbootwithmongo.controller;


import com.example.springbootwithmongo.springbootwithmongo.model.Book;
import com.example.springbootwithmongo.springbootwithmongo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookRepository repository;

     @PostMapping("/addBook")
    public String saveBook (@RequestBody Book book) {
        repository.save(book);
        return "Book Added. ID => " + book.getId();
    }
    @GetMapping("/findAllBooks")
    public List<Book> getBooks(){
         return repository.findAll();

    }
    @GetMapping("/findAllBooks/{id}")
    public Optional<Book> getBook(@PathVariable int id) {
        return repository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
         repository.deleteById(id);
         return "Book Removed";
    }



}
