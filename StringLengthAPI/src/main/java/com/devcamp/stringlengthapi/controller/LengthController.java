package com.devcamp.stringlengthapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LengthController {

    @GetMapping("/length")
    public int getLength(@RequestParam String input) {
        return input.length();
    }
}
