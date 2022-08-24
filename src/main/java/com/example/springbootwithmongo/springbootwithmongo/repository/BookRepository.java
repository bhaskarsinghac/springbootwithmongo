package com.example.springbootwithmongo.springbootwithmongo.repository;


import com.example.springbootwithmongo.springbootwithmongo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface BookRepository extends MongoRepository<Book, Integer>{
}
