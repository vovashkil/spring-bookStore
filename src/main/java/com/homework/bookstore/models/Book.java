package com.homework.bookstore.models;

import com.homework.bookstore.utils.Type;

public class Book {
    private String name;
    private String author;
    private int price;
    private Type type;

    public Book() {
    }

    public Book(String name, String author, int price, Type type) {
        this.name = name;
        this.author = author;
        this.price = price;

        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return " Book{ " +
                "name = '" + name + "'" +
                ", author = '" + author + "'" +
                ", price = " + price +
                ", type = " + type +
                " }";
    }
}
