package com.devcamp.customeraccount.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account() {
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }

    @Override
    public String toString() {
        BigDecimal bd = new BigDecimal(balance).setScale(2, RoundingMode.HALF_UP);
        return customer.toString() + " balance=$" + bd.toString();
    }
}
