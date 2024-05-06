package com.example.graphqlproject.service;

import com.example.graphqlproject.model.Book;
import com.example.graphqlproject.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepo;

    @Autowired
    public BookServiceImpl(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book create(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    @Override
    public Book get(int bookId) {
        return bookRepo.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
    }
}
