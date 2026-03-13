package com.devcamp.shape.controller;

import com.devcamp.shape.model.Circle;
import com.devcamp.shape.model.Rectangle;
import com.devcamp.shape.model.Square;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {

    @GetMapping("/circle-area")
    public double getCircleArea(@RequestParam double radius) {
        Circle circle = new Circle(radius);
        return circle.getArea();
    }

    @GetMapping("/circle-perimeter")
    public double getCirclePerimeter(@RequestParam double radius) {
        Circle circle = new Circle(radius);
        return circle.getPerimeter();
    }

    @GetMapping("/rectangle-area")
    public double getRectangleArea(@RequestParam double width, @RequestParam double height) {
        Rectangle rectangle = new Rectangle(width, height);
        return rectangle.getArea();
    }

    @GetMapping("/rectangle-perimeter")
    public double getRectanglePerimeter(@RequestParam double width, @RequestParam double height) {
        Rectangle rectangle = new Rectangle(width, height);
        return rectangle.getPerimeter();
    }

    @GetMapping("/square-area")
    public double getSquareArea(@RequestParam double side) {
        Square square = new Square(side);
        return square.getArea();
    }

    @GetMapping("/square-perimeter")
    public double getSquarePerimeter(@RequestParam double side) {
        Square square = new Square(side);
        return square.getPerimeter();
    }
}
