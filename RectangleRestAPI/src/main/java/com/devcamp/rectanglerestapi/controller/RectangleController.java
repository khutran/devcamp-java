package com.devcamp.rectanglerestapi.controller;

import com.devcamp.rectanglerestapi.model.Rectangle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RectangleController {

    @GetMapping("/rectangle-area")
    public double getArea(@RequestParam float length, @RequestParam float width) {
        Rectangle rectangle = new Rectangle(length, width);
        return rectangle.getArea();
    }

    @GetMapping("/rectangle-perimeter")
    public double getPerimeter(@RequestParam float length, @RequestParam float width) {
        Rectangle rectangle = new Rectangle(length, width);
        return rectangle.getPerimeter();
    }
}
