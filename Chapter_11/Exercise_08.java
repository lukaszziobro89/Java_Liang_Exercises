package Chapter_11;

import Chapter_09.Chapter_Classes.Account;

/*
(New Account class) An Account class was specified in Programming
Exercise 9.7. Design a new Account class as follows:
    ■ Add a new data field name of the String type to store the name of the customer.
    ■ Add a new constructor that constructs an account with the specified name, id, and balance.
    ■ Add a new data field named transactions whose type is ArrayList that stores the transaction for the accounts.
    Each transaction is an instance of the Transaction class.
    ■ Modify the withdraw and deposit methods to add a transaction to the transactions array list.
    ■ All other properties and methods are the same as in Programming Exercise 9.7.
    -date: java.util.Date (The date of this transaction.)
    -type: char (The type of the transaction, such as 'W' for withdrawal, 'D' for deposit.)
    -amount: double (The amount of the transaction.)
    -balance: double (The new balance after this transaction.)
    -description: String (The description of this transaction.)
    +Transaction(type: char, amount: double, balance: double, description: String) -
    (Construct a Transaction with the specified date, type, balance, and description)
Write a test program that creates an Account with annual interest rate 1.5%, balance 1000, id 1122, and name George.
Deposit $30, $40, and $50 to the account and withdraw $5, $4, and $2 from the account.
Print an account summary that shows account holder name, interest rate, balance, and all transactions.
 */
public class Exercise_08 {
    public static void main(String[] args) {
        // create account
        Account account = new Account(1122,"George", 1000, 1.5);
        // make transactions
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);
        System.out.println(account.toString());
    }
}
