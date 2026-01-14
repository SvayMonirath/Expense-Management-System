package com.expenseManagement.models;

public class Income extends Transaction {
    public Income(String id, double amount, String description) {
        super(id, amount, description);
    }

    @Override
    public String toString() {
        return "Income [ID: " + getId() + ", Amount: " + getAmount() + ", Date: " + getDate() + ", Description: " + getDescription() + "]";
    }
}
