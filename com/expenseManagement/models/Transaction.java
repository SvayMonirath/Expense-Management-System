package com.expenseManagement.models;

public class Transaction {
    private String id;
    private double amount;
    private String date;
    private String description;

    public Transaction(String id, double amount, String date, String description) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public double getAmount() {
        return amount;
    }
    public String getDate() {
        return date;
    }
    public String getDescription() {
        return description;
    }
}
