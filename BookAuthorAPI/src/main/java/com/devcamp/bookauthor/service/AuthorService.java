package com.devcamp.bookauthor.service;

import com.devcamp.bookauthor.model.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthorService {
    public ArrayList<Author> getAllAuthors() {
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Tanaka", "tanaka@gmail.com", 'm'));
        authors.add(new Author("Sato", "sato@gmail.com", 'f'));
        authors.add(new Author("Suzuki", "suzuki@gmail.com", 'm'));
        authors.add(new Author("Takahashi", "takahashi@gmail.com", 'm'));
        authors.add(new Author("Ito", "ito@gmail.com", 'f'));
        authors.add(new Author("Watanabe", "watanabe@gmail.com", 'm'));
        return authors;
    }

    public Author getAuthorByEmail(String email) {
        for (Author author : getAllAuthors()) {
            if (author.getEmail().equalsIgnoreCase(email)) {
                return author;
            }
        }
        return null;
    }

    public ArrayList<Author> getAuthorsByGender(char gender) {
        ArrayList<Author> result = new ArrayList<>();
        for (Author author : getAllAuthors()) {
            if (author.getGender() == Character.toLowerCase(gender)) {
                result.add(author);
            }
        }
        return result;
    }
}
