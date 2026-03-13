package com.devcamp.customerinvoice.service;

import com.devcamp.customerinvoice.model.Customer;
import com.devcamp.customerinvoice.model.Invoice;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InvoiceService {
    public ArrayList<Invoice> getAllInvoices() {
        ArrayList<Invoice> invoices = new ArrayList<>();
        invoices.add(new Invoice(101, new Customer(1, "John Doe", 10), 1000.0));
        invoices.add(new Invoice(102, new Customer(2, "Jane Smith", 20), 2000.0));
        invoices.add(new Invoice(103, new Customer(3, "Bob Johnson", 15), 1500.0));
        return invoices;
    }
}
