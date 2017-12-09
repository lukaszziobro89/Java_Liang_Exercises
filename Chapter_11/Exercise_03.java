package Chapter_11;
import Chapter_09.Chapter_Classes.Account;
import Chapter_11.Chapter_Classes.CheckingAccount;
import Chapter_11.Chapter_Classes.SavingsAccount;
/*
(Subclasses of Account) In Programming Exercise 9.7, the Account class was defined to model a bank account.
An account has the properties account number, balance, annual interest rate, and date created, and methods to deposit
and withdraw funds. Create two subclasses for checking and saving accounts. A checking account has an overdraft limit,
but a savings account cannot be overdrawn. Write a test program that creates objects of Account, SavingsAccount, and
CheckingAccount and invokes their toString() methods.
 */
public class Exercise_03 {
    public static void main(String[] args) {
        Account account = new Account();
        Account checkingAccount = new CheckingAccount(1, 0);
        Account savingsAccount = new SavingsAccount(2,0);
        // standard account
        account.deposit(10);
        System.out.println(account.getBalance());
        System.out.println(account.toString());
        // checking account
        System.out.println(checkingAccount.getBalance());
        checkingAccount.deposit(10);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(120);
        System.out.println(checkingAccount.toString());
        // savings account
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(10);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(20);
        System.out.println(savingsAccount.toString());

    }
}
