package com.devcamp.oddevennumberapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddEvenController {

    @GetMapping("/checknumber")
    public String checkNumber(@RequestParam int number) {
        if (number % 2 == 0) {
            return "Số " + number + " là số chẵn";
        } else {
            return "Số " + number + " là số lẻ";
        }
    }
}
