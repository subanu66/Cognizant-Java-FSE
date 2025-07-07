package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private String serviceName;
    private BookRepository bookRepository;

    // Constructor for constructor injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
        System.out.println("Constructor injection: " + serviceName);
    }

    // Setter method for setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter injection: BookRepository injected");
    }

    public void displayBooks() {
        System.out.println("Books from " + serviceName + ":");
        bookRepository.getAllBooks().forEach(System.out::println);
    }
}
