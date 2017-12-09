package Chapter_09.Chapter_Classes;
import Chapter_11.Chapter_Classes.Transaction;

import java.util.ArrayList;
import java.util.Date;
public class Account {

    // fields (attributes)
    private int id;
    private String name;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> accTransactions;

    // Accessor and mutator methods for id, balance, and annualInterestRate.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // The accessor method for dateCreated
    public String getDateCreated(){
        return dateCreated.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getAccTransactions() {
        return new ArrayList<>(accTransactions);
    }

    // A no-arg constructor that creates a default account.
    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public Account(int id, double balance){
        this();
        this.id = id;
        this.balance = balance;
    }

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public Account(int id, String name, double balance, double annualInterestRate) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
        this.accTransactions = new ArrayList<>();
    }

    // constructor that constructs an account with the specified name, id, and balance.
    public Account(int id, String name, double balance){
        this(id, balance);
        this.name = name;
    }

    /** A method named getMonthlyInterestRate() that returns the monthly interest rate. */
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    /** A method named getMonthlyInterest() that returns the monthly interest. */
    public double getMonthlyInterest(){
        return balance * (getMonthlyInterestRate() / 100);
    }

    /** A method named withdraw that withdraws a specified amount from the account. */
    public void withdraw(double amount){
        accTransactions.add(new Transaction('W', amount, balance, "withdraw"));
        balance -= amount;
    }

    /** A method named deposit that deposits a specified amount to the account. */
    public void deposit(double deposit){
        accTransactions.add(new Transaction('D', deposit, balance, "deposit"));
        balance += deposit;
    }

    /** Prints information about account */
    public StringBuilder printAccountInformation(){
        StringBuilder accountInformation = new StringBuilder();
        accountInformation.append("Account information:\n")
            .append("\tAccount id: ").append(this.getId()).append("\n")
                .append("\tAccount balance: ").append(this.getBalance()).append("\n")
                .append("\tAccount annual interest rate: ").append(this.getAnnualInterestRate()).append("\n")
                .append("\tAccount create date: ").append(this.getDateCreated()).append("\n");

        return accountInformation;
    }

    /** Overrided toString method */
    @Override
    public String toString() {
        return "Account name: " + name + "\n" + "Interest rate: " + annualInterestRate + "\n" + accTransactions;
    }
}
