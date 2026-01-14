package com.expenseManagement.models;

import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private String password;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    // Constructor
    public User(String username, String email, String password) {

        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }

        this.username = username;
        this.email = email;
        this.password = password;
        this.transactions = new ArrayList<>();
    }

    // method to add transaction
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t.toString());
        }
    }


    // getter
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
