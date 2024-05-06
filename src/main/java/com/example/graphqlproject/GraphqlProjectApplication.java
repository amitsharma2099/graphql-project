package com.example.graphqlproject;

import com.example.graphqlproject.model.Book;
import com.example.graphqlproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements ApplicationRunner {
	@Autowired
	private BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Book book1 = Book.builder().title("Complete Reference").desc("for learning advance java").pages(1000).price(500).author("XYZ").build();
		Book book2 = Book.builder().title("Head First Java").desc("for learning core java").pages(800).price(300).author("ABC").build();
		Book book3 = Book.builder().title("System Design").desc("for learning system design").pages(300).price(200).author("PQR").build();

		bookService.create(book1);
		bookService.create(book2);
		bookService.create(book3);
	}
}
