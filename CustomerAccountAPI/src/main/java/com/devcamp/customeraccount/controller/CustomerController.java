package com.devcamp.customeraccount.controller;

import com.devcamp.customeraccount.model.Customer;
import com.devcamp.customeraccount.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public ArrayList<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }
}
