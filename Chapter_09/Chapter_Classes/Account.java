package Chapter_09.Chapter_Classes;
import java.util.Date;
public class Account {

    // fields (attributes)
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

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

    // A constructor that creates an account with the specified id and initial balance.
    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
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
        balance -= amount;
    }

    /** A method named deposit that deposits a specified amount to the account. */
    public void deposit(double deposit){
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
}
