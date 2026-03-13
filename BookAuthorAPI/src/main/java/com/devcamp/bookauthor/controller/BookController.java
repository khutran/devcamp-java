package com.devcamp.bookauthor.controller;

import com.devcamp.bookauthor.model.Book;
import com.devcamp.bookauthor.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/book-quantity")
    public ArrayList<Book> getBooksByQuantity(@RequestParam int quantityNumber) {
        return bookService.getBooksByMinQty(quantityNumber);
    }
}
