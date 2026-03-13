package com.devcamp.customervisit.service;

import com.devcamp.customervisit.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService {
    public ArrayList<Customer> getAllCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        
        Customer c1 = new Customer("John Snow");
        c1.setMember(true);
        c1.setMemberType("Gold");
        customers.add(c1);
        
        Customer c2 = new Customer("Arya Stark");
        c2.setMember(true);
        c2.setMemberType("Silver");
        customers.add(c2);
        
        Customer c3 = new Customer("Tyrion Lannister");
        c3.setMember(false);
        customers.add(c3);
        
        return customers;
    }
}
