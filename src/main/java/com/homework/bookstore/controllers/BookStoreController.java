package com.homework.bookstore.controllers;

import com.homework.bookstore.models.Book;
import com.homework.bookstore.services.BookStoreService;
import com.homework.bookstore.utils.Type;

import java.util.List;
import java.util.Map;

public class BookStoreController {
    private BookStoreService bookStoreService;

    public BookStoreController(BookStoreService bookStoreService) {
        this.bookStoreService = bookStoreService;
    }

    public BookStoreService getBookStoreDao() {
        return bookStoreService;
    }

    public Book addBook(Book book) {
        return bookStoreService.addBook(book);
    }

    public Book addBook(String name, String author, int price, Type type) {
        return bookStoreService.addBook(name, author, price, type);
    }

    public Book getBookByName(String name) {
        return bookStoreService.getBookByName(name);
    }

    public List<String> getAllBookNames() {
        return bookStoreService.getAllBookNames();
    }

    public List<Book> getBookByAuthor(String author) {
        return bookStoreService.getBookByAuthor(author);
    }

    public Map<Type, List<Book>> getBooksByType() {
        return bookStoreService.getBooksByType();
    }

}
