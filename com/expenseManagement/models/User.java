package com.expenseManagement.models;

import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private String password;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    // Constructor
    public User(String username, String email, String password) {
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
            System.out.println("ID: " + t.getId() + ", Amount: " + t.getAmount() + ", Date: " + t.getDate() + ", Description: " + t.getDescription());
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
