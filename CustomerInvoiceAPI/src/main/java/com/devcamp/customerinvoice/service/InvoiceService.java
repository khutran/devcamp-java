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
        invoices.add(new Invoice(104, new Customer(4, "Customer 4", 10), 400.0));
        invoices.add(new Invoice(105, new Customer(5, "Customer 5", 15), 500.0));
        invoices.add(new Invoice(106, new Customer(6, "Customer 6", 5), 600.0));
        return invoices;
    }
}
