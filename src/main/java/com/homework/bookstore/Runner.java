package com.homework.bookstore;

import com.homework.bookstore.controllers.BookStoreController;
import com.homework.bookstore.models.Book;
import com.homework.bookstore.utils.Type;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bookStoreAppContext.xml");

        BookStoreController controller = context.getBean("bookStoreController", BookStoreController.class);

        for (Map.Entry<Type, List<Book>> books : controller.getBooksByType().entrySet()) {
            System.out.println("BOOK TYPE = " + books.getKey() + " "
                    + ": \n" + books.getValue() + "\n");
        }

        context.close();

    }
}
