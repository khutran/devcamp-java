package com.devcamp.customervisit.controller;

import com.devcamp.customervisit.model.Customer;
import com.devcamp.customervisit.model.Visit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class VisitController {

    @GetMapping("/visits")
    public ArrayList<Visit> getVisits() {
        // 4. Khởi tạo 3 đối tượng khách hàng
        Customer c1 = new Customer("Alice");
        c1.setMember(true);
        c1.setMemberType("Gold");

        Customer c2 = new Customer("Bob");
        c2.setMember(true);
        c2.setMemberType("Silver");

        Customer c3 = new Customer("Charlie");
        c3.setMember(false);

        // In ra console
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        // 5. Khởi tạo 3 đối tượng chuyến đi
        Visit v1 = new Visit(c1, new Date());
        v1.setServiceExpense(100.0);
        v1.setProductExpense(50.0);

        Visit v2 = new Visit(c2, new Date());
        v2.setServiceExpense(150.0);
        v2.setProductExpense(30.0);

        Visit v3 = new Visit(c3, new Date());
        v3.setServiceExpense(80.0);
        v3.setProductExpense(20.0);

        // In ra console
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());

        // 6. Thêm vào ArrayList Visit
        ArrayList<Visit> visitList = new ArrayList<>();
        visitList.add(v1);
        visitList.add(v2);
        visitList.add(v3);

        return visitList;
    }
}
