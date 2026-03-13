package com.devcamp.bookauthorv2.controller;

import com.devcamp.bookauthorv2.model.Author;
import com.devcamp.bookauthorv2.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BookController {

    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        // 4. Khởi tạo 6 đối tượng tác giả
        Author a1 = new Author("Author 1", "a1@gmail.com", 'm');
        Author a2 = new Author("Author 2", "a2@gmail.com", 'f');
        Author a3 = new Author("Author 3", "a3@gmail.com", 'm');
        Author a4 = new Author("Author 4", "a4@gmail.com", 'f');
        Author a5 = new Author("Author 5", "a5@gmail.com", 'm');
        Author a6 = new Author("Author 6", "a6@gmail.com", 'f');

        // In ra console
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
        System.out.println(a5.toString());
        System.out.println(a6.toString());

        // 5. Khởi tạo 3 ArrayList Author
        ArrayList<Author> list1 = new ArrayList<>();
        list1.add(a1);
        list1.add(a2);

        ArrayList<Author> list2 = new ArrayList<>();
        list2.add(a3);
        list2.add(a4);

        ArrayList<Author> list3 = new ArrayList<>();
        list3.add(a5);
        list3.add(a6);

        // 6. Khởi tạo 3 đối tượng sách
        Book book1 = new Book("Java Advanced", list1, 200.0, 5);
        Book book2 = new Book("Spring Boot V2", list2, 250.0, 10);
        Book book3 = new Book("Microservices Pattern", list3, 300.0, 8);

        // In ra console
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        // 7. Thêm vào ArrayList Book
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        return bookList;
    }
}
