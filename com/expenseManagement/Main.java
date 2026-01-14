package com.expenseManagement;

import com.expenseManagement.models.User;
import com.expenseManagement.models.Income;
import com.expenseManagement.models.Expense;

public class Main {
    public static void main(String[] args) {

        User user = new User("Monirath", "monirath@example.com", "password123");

        Income salary = new Income("INC001", 1500.0, "2024-10-01", "Salary");
        Expense expense1 = new Expense("EXP001", 200.0, "2024-10-02", "Groceries");
        Expense expense2 = new Expense("EXP002", 100.0, "2024-10-03", "Transport");
        user.addTransaction(salary);
        user.addTransaction(expense1);
        user.addTransaction(expense2);
        user.showTransactions();

    }
}
