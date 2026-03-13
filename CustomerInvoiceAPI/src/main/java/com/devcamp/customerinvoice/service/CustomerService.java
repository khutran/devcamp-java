package com.devcamp.customerinvoice.service;

import com.devcamp.customerinvoice.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService {
    public ArrayList<Customer> getAllCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "John Doe", 10));
        customers.add(new Customer(2, "Jane Smith", 20));
        customers.add(new Customer(3, "Bob Johnson", 15));
        return customers;
    }
}
