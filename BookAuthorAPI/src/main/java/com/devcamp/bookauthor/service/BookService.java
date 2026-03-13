package com.devcamp.bookauthor.service;

import com.devcamp.bookauthor.model.Author;
import com.devcamp.bookauthor.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class BookService {
    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> books = new ArrayList<>();

        // Book 1
        ArrayList<Author> authors1 = new ArrayList<>(Arrays.asList(
            new Author("Tanaka", "tanaka@gmail.com", 'm'),
            new Author("Sato", "sato@gmail.com", 'f')
        ));
        books.add(new Book("Java Programming", authors1, 29.99, 15));

        // Book 2
        ArrayList<Author> authors2 = new ArrayList<>(Arrays.asList(
            new Author("Suzuki", "suzuki@gmail.com", 'm'),
            new Author("Takahashi", "takahashi@gmail.com", 'm')
        ));
        books.add(new Book("Spring Boot Guide", authors2, 39.99, 5));

        // Book 3
        ArrayList<Author> authors3 = new ArrayList<>(Arrays.asList(
            new Author("Ito", "ito@gmail.com", 'f'),
            new Author("Watanabe", "watanabe@gmail.com", 'm')
        ));
        books.add(new Book("React Masterclass", authors3, 34.99, 20));

        return books;
    }

    public ArrayList<Book> getBooksByMinQty(int quantityNumber) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : getAllBooks()) {
            if (book.getQty() >= quantityNumber) {
                result.add(book);
            }
        }
        return result;
    }
}
