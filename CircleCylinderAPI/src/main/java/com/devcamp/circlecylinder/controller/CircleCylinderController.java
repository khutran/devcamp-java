package com.devcamp.circlecylinder.controller;

import com.devcamp.circlecylinder.model.Circle;
import com.devcamp.circlecylinder.model.Cylinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircleCylinderController {

    @GetMapping("/circle-area")
    public double getCircleArea(@RequestParam double radius) {
        Circle circle = new Circle(radius);
        return circle.getArea();
    }

    @GetMapping("/cylinder-volume")
    public double getCylinderVolume(@RequestParam double radius, @RequestParam double height) {
        Cylinder cylinder = new Cylinder(radius, height);
        return cylinder.getVolume();
    }
}
