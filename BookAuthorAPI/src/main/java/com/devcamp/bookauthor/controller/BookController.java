package com.devcamp.bookauthor.controller;

import com.devcamp.bookauthor.model.Author;
import com.devcamp.bookauthor.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BookController {

    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        // 4. Khởi tạo 3 đối tượng tác giả
        Author author1 = new Author("Tan Aha", "tanaha@gmail.com", 'm');
        Author author2 = new Author("Nguyen Nhat Anh", "nhatanh@gmail.com", 'm');
        Author author3 = new Author("J.K. Rowling", "rowling@gmail.com", 'f');

        // In ra console
        System.out.println(author1.toString());
        System.out.println(author2.toString());
        System.out.println(author3.toString());

        // 5. Khởi tạo 3 đối tượng sách
        Book book1 = new Book("Ky uc vinh cuu", author1, 150000, 10);
        Book book2 = new Book("Mat biec", author2, 120000, 50);
        Book book3 = new Book("Harry Potter", author3, 350000, 100);

        // In ra console
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        // 6. Thêm vào ArrayList
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        // 7. Trả ra ArrayList
        return bookList;
    }
}
