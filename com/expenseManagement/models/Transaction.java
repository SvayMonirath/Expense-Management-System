package com.expenseManagement.models;

import java.time.LocalDate;

public class Transaction {
    private String id;
    private double amount;
    private LocalDate date;
    private String description;

    public Transaction(String id, double amount, String description) {

        // input validation
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Transaction ID cannot be empty");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description cannot be empty");
        }

        this.id = id;
        this.amount = amount;
        this.date = LocalDate.now();
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public double getAmount() {
        return amount;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getDescription() {
        return description;
    }
}
