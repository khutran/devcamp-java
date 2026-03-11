package com.devcamp.circlerestapi.controller;

import com.devcamp.circlerestapi.model.Circle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircleController {

    @GetMapping("/circle-area")
    public double getCircleArea(@RequestParam double radius) {
        // subTask 4: Khởi tạo đối tượng hình tròn
        Circle circle = new Circle(radius);

        // In ra console sử dụng toString
        System.out.println(circle.toString());

        // subTask 5: Trả ra giá trị diện tích
        return circle.getArea();
    }
}
