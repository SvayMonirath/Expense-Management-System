package com.expenseManagement.models;

public class Expense extends Transaction {
    public Expense(String id, double amount, String description) {
        super(id, amount, description);
    }
    @Override
    public String toString() {
        return "Expense [ID: " + getId() + ", Amount: " + getAmount() + ", Date: " + getDate() + ", Description: " + getDescription() + "]";
    }
}
