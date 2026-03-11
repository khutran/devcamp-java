package com.devcamp.invoicerestapi.controller;

import com.devcamp.invoicerestapi.model.InvoiceItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class InvoiceController {

    @GetMapping("/invoices")
    public ArrayList<InvoiceItem> getInvoices() {
        // subTask 4: Khởi tạo 3 đối tượng hóa đơn
        InvoiceItem item1 = new InvoiceItem("INV001", "Laptop", 1, 1200.0);
        InvoiceItem item2 = new InvoiceItem("INV002", "Mouse", 2, 25.0);
        InvoiceItem item3 = new InvoiceItem("INV003", "Monitor", 1, 300.0);

        // In ra console sử dụng toString
        System.out.println(item1.toString());
        System.out.println(item2.toString());
        System.out.println(item3.toString());

        // subTask 5: Thêm vào ArrayList mới
        ArrayList<InvoiceItem> invoiceList = new ArrayList<>();
        invoiceList.add(item1);
        invoiceList.add(item2);
        invoiceList.add(item3);

        return invoiceList;
    }
}
