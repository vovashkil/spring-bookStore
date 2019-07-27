package com.homework.bookstore.dao;

import com.homework.bookstore.models.Book;
import com.homework.bookstore.utils.Type;

import java.util.List;
import java.util.Map;

public interface BookStoreDao {
    Book addBook(Book book);
    Book addBook(String name, String author, int price, Type type);
    Book getBookByName(String name);
    List<String> getAllBookNames();
    List<Book> getBookByAuthor(String author);
    Map<Type, List<Book>> getBooksByType();

}
