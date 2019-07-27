package com.homework.bookstore.services;

import com.homework.bookstore.dao.BookStoreDao;
import com.homework.bookstore.dao.BookStoreDaoImpl;
import com.homework.bookstore.models.Book;
import com.homework.bookstore.utils.Type;

import java.util.List;
import java.util.Map;

public class BookStoreService {
    private BookStoreDao bookStoreDao;

    public BookStoreService(BookStoreDao bookStoreDao) {
        this.bookStoreDao = bookStoreDao;
    }

    public BookStoreDao getBookStoreDao() {
        return bookStoreDao;
    }

    public Book addBook(Book book) {
        return bookStoreDao.addBook(book);
    }

    public Book addBook(String name, String author, int price, Type type) {
        return bookStoreDao.addBook(name, author, price, type);
    }

    public Book getBookByName(String name) {
        return bookStoreDao.getBookByName(name);
    }

    public List<String> getAllBookNames() {
        return bookStoreDao.getAllBookNames();
    }

    public List<Book> getBookByAuthor(String author) {
        return bookStoreDao.getBookByAuthor(author);
    }


    public Map<Type, List<Book>> getBooksByType() {
        return bookStoreDao.getBooksByType();
    }

}
