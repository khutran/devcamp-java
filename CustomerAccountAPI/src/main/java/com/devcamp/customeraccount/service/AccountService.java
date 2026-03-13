package com.devcamp.customeraccount.service;

import com.devcamp.customeraccount.model.Account;
import com.devcamp.customeraccount.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AccountService {
    public ArrayList<Account> getAllAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1001, new Customer(1, "Alice Green", 5), 500.50));
        accounts.add(new Account(1002, new Customer(2, "Charlie Brown", 10), 1200.75));
        accounts.add(new Account(1003, new Customer(3, "Diana Prince", 8), 2500.00));
        return accounts;
    }
}
