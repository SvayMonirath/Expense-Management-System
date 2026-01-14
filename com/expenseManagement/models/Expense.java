package com.expenseManagement.models;

public class Expense extends Transaction {
    public Expense(String id, double amount, String date, String description) {
        super(id, amount, date, description);
    }
}
