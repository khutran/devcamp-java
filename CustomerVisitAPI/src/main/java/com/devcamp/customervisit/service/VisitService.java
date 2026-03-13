package com.devcamp.customervisit.service;

import com.devcamp.customervisit.model.Customer;
import com.devcamp.customervisit.model.Visit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class VisitService {
    public ArrayList<Visit> getAllVisits() {
        ArrayList<Visit> visits = new ArrayList<>();
        
        Customer c1 = new Customer("John Snow");
        c1.setMember(true);
        c1.setMemberType("Gold");
        Visit v1 = new Visit(c1, new Date());
        v1.setServiceExpense(100.0);
        v1.setProductExpense(50.0);
        visits.add(v1);
        
        Customer c2 = new Customer("Arya Stark");
        c2.setMember(true);
        c2.setMemberType("Silver");
        Visit v2 = new Visit(c2, new Date());
        v2.setServiceExpense(200.0);
        v2.setProductExpense(80.0);
        visits.add(v2);
        
        Customer c3 = new Customer("Tyrion Lannister");
        c3.setMember(false);
        Visit v3 = new Visit(c3, new Date());
        v3.setServiceExpense(300.0);
        v3.setProductExpense(120.0);
        visits.add(v3);
        
        return visits;
    }
}
