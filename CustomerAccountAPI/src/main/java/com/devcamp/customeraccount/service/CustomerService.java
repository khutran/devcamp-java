package com.devcamp.customeraccount.service;

import com.devcamp.customeraccount.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService {
    public ArrayList<Customer> getAllCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Alice Green", 5));
        customers.add(new Customer(2, "Charlie Brown", 10));
        customers.add(new Customer(3, "Diana Prince", 8));
        return customers;
    }
}
