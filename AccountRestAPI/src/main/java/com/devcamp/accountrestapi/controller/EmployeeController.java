package com.devcamp.accountrestapi.controller;

import com.devcamp.accountrestapi.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class EmployeeController { // Oops, naming should be AccountController but let's check subTask 3

    @GetMapping("/accounts")
    public ArrayList<Account> getAccounts() {
        // subTask 4: Khởi tạo 3 đối tượng tài khoản
        Account acc1 = new Account("ACC001", "Khu Tran", 1000);
        Account acc2 = new Account("ACC002", "Nguyen Van A", 500);
        Account acc3 = new Account("ACC003", "Le Thi B", 2000);

        // In ra console sử dụng toString
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());

        // subTask 5: Thêm vào ArrayList mới
        ArrayList<Account> accountList = new ArrayList<>();
        accountList.add(acc1);
        accountList.add(acc2);
        accountList.add(acc3);

        return accountList;
    }
}
