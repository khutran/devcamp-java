package com.devcamp.oddevennumberapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddEvenController {

    @GetMapping("/checknumber")
    public String checkNumber(@RequestParam int number) {
        if (number % 2 == 0) {
            return "S\u1ed1 " + number + " l\u00e0 s\u1ed1 ch\u1eb5n";
        } else {
            return "S\u1ed1 " + number + " l\u00e0 s\u1ed1 l\u1ebb";
        }
    }
}
