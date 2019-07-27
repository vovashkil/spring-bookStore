package com.homework.bookstore.dao;

import com.homework.bookstore.models.Book;
import com.homework.bookstore.utils.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookStoreDaoImpl implements BookStoreDao {
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    @Override
    public Book addBook(String name, String author, int price, Type type) {
        Book book = new Book(name, author, price, type);
        books.add(book);
        return book;
    }

    @Override
    public Book getBookByName(String name) {
        return books.stream().filter(book -> book.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    @Override
    public List<String> getAllBookNames() {
        return books.stream().map(Book::getName).collect(Collectors.toList());
    }

    @Override
    public List<Book> getBookByAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
    }

    @Override
    public Map<Type, List<Book>> getBooksByType() {
        Map<Type, List<Book>> map = new HashMap<Type, List<Book>>(){};
        if (books != null) {
            books.forEach(book -> {
                List<Book> items = map.get(book.getType());
                if (items != null) {
                    items.add(book);
                    map.replace(book.getType(), items);
                } else {
                    List<Book> itemsTmp = new ArrayList<>();
                    if (itemsTmp.add(book)) {
                        map.put(book.getType(), itemsTmp);
                    }
                }
            });
        };

        return map;

    }
}
