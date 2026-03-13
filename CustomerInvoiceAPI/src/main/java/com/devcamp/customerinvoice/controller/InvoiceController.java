package com.devcamp.customerinvoice.controller;

import com.devcamp.customerinvoice.model.Customer;
import com.devcamp.customerinvoice.model.Invoice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class InvoiceController {

    @GetMapping("/invoices")
    public ArrayList<Invoice> getInvoices() {
        // 4. Khởi tạo 3 đối tượng khách hàng
        Customer c1 = new Customer(101, "John Doe", 10);
        Customer c2 = new Customer(102, "Maria Smith", 15);
        Customer c3 = new Customer(103, "Alex Wong", 20);

        // In ra console
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        // 5. Khởi tạo 3 đối tượng hóa đơn
        Invoice inv1 = new Invoice(1001, c1, 1000.0);
        Invoice inv2 = new Invoice(1002, c2, 1500.0);
        Invoice inv3 = new Invoice(1003, c3, 2000.0);

        // In ra console
        System.out.println(inv1.toString());
        System.out.println(inv2.toString());
        System.out.println(inv3.toString());

        // 6. Thêm vào ArrayList Invoice
        ArrayList<Invoice> invoiceList = new ArrayList<>();
        invoiceList.add(inv1);
        invoiceList.add(inv2);
        invoiceList.add(inv3);

        return invoiceList;
    }
}
