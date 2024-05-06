package com.example.graphqlproject.controller;

import com.example.graphqlproject.model.Book;
import com.example.graphqlproject.service.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @QueryMapping("allBooks")
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @QueryMapping("getBook")
    public Book get(@Argument int bookId) {
        return bookService.get(bookId);
    }

    @MutationMapping("createBook")
    public Book create(@Argument BookInput book) {
        Book b = Book.builder().title(book.getTitle()).desc(book.getDesc()).price(book.getPrice()).author(book.getAuthor()).pages(book.getPages()).build();
        return bookService.create(b);
    }
}

@Getter
@Setter
class BookInput {
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}