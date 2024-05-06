package com.example.graphqlproject.service;

import com.example.graphqlproject.model.Book;

import java.util.List;

public interface BookService {
    Book create(Book book);
    List<Book> getAll();
    Book get(int bookId);
}
