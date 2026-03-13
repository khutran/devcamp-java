package com.devcamp.customeraccount.controller;

import com.devcamp.customeraccount.model.Account;
import com.devcamp.customeraccount.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AccountController {

    @GetMapping("/accounts")
    public ArrayList<Account> getAccounts() {
        // 4. Khởi tạo 3 đối tượng khách hàng
        Customer c1 = new Customer(201, "Alice Freeman", 5);
        Customer c2 = new Customer(202, "Bob Martin", 10);
        Customer c3 = new Customer(203, "Charlie Davis", 15);

        // In ra console
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        // 5. Khởi tạo 3 đối tượng tài khoản
        Account acc1 = new Account(5001, c1, 1000.0);
        Account acc2 = new Account(5002, c2, 2500.0);
        Account acc3 = new Account(5003, c3, 5000.0);

        // In ra console
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());

        // 6. Thêm vào ArrayList Account
        ArrayList<Account> accountList = new ArrayList<>();
        accountList.add(acc1);
        accountList.add(acc2);
        accountList.add(acc3);

        return accountList;
    }
}
