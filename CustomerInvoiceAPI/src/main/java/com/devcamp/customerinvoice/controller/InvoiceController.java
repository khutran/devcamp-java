package com.devcamp.customerinvoice.controller;

import com.devcamp.customerinvoice.model.Invoice;
import com.devcamp.customerinvoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping("/invoices")
    public ArrayList<Invoice> getInvoices() {
        return invoiceService.getAllInvoices();
    }

    @GetMapping("/invoices/{invoiceId}")
    public Invoice getInvoiceByIndex(@PathVariable("invoiceId") int index) {
        ArrayList<Invoice> allInvoices = invoiceService.getAllInvoices();
        if (index >= 0 && index < allInvoices.size()) {
            return allInvoices.get(index);
        }
        return null;
    }
}
