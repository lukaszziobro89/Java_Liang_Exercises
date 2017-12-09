package Chapter_11.Chapter_Classes;

import java.util.Date;

public class Transaction {
    private Date date;
    private char type; // The type of the transaction, such as 'W' for withdrawal, 'D' for deposit.
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Type: " + type + " Date: " + date + "Description: " + description +
                "Amount: " + amount + " Balance: " + balance + "\n";
    }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
