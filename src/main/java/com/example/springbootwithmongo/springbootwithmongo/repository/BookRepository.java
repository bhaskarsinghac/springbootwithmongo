package com.example.springbootwithmongo.springbootwithmongo.repository;


import com.example.springbootwithmongo.springbootwithmongo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer>{
}
