package com.devcamp.bookauthor.model;

import java.util.ArrayList;

public class Book {
    private String name;
    private ArrayList<Author> authors;
    private double price;
    private int qty = 0;

    public Book() {
    }

    public Book(String name, ArrayList<Author> authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, ArrayList<Author> authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        if (authors == null || authors.isEmpty()) return "";
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < authors.size(); i++) {
            names.append(authors.get(i).getName());
            if (i < authors.size() - 1) {
                names.append(",");
            }
        }
        return names.toString();
    }

    @Override
    public String toString() {
        StringBuilder authorsStr = new StringBuilder("{");
        for (int i = 0; i < authors.size(); i++) {
            authorsStr.append(authors.get(i).toString());
            if (i < authors.size() - 1) {
                authorsStr.append(",");
            }
        }
        authorsStr.append("}");
        return "Book[name=" + name + ",authors=" + authorsStr + ",price=" + price + ",qty=" + qty + "]";
    }
}
