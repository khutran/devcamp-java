package com.devcamp.customerinvoice.controller;

import com.devcamp.customerinvoice.model.Invoice;
import com.devcamp.customerinvoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
