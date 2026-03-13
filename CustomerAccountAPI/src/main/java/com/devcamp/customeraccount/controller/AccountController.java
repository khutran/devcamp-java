package com.devcamp.customeraccount.controller;

import com.devcamp.customeraccount.model.Account;
import com.devcamp.customeraccount.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    public ArrayList<Account> getAccounts() {
        return accountService.getAllAccounts();
    }
}
