package com.devcamp.hellodevcampworld.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {

    @CrossOrigin
    @GetMapping("/hello")
    public String hello() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
        LocalDateTime now = LocalDateTime.now();
        return "Hello devcamper, welcome to Devcamp world! now it is " + dtf.format(now) + ".";
    }
}
