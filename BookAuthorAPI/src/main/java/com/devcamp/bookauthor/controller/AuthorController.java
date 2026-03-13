package com.devcamp.bookauthor.controller;

import com.devcamp.bookauthor.model.Author;
import com.devcamp.bookauthor.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/author-info")
    public Author getAuthorInfo(@RequestParam String email) {
        return authorService.getAuthorByEmail(email);
    }

    @GetMapping("/author-gender")
    public ArrayList<Author> getAuthorsByGender(@RequestParam char gender) {
        return authorService.getAuthorsByGender(gender);
    }
}
