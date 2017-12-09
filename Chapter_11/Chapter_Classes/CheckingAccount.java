package Chapter_11.Chapter_Classes;
import Chapter_09.Chapter_Classes.Account;
public class CheckingAccount extends Account {
    private double OVERDRAFT_LIMIT = -100;

    // default constructor
    public CheckingAccount(){
        super();
    }

    // args constructor
    public CheckingAccount(int id, double balance){
        super(id, balance);
    }

    /** Overrided method of Account class */
    @Override
    public void withdraw(double amount){
        if(getBalance() - amount >= OVERDRAFT_LIMIT){
            super.withdraw(amount);
        }
    }

    /** Overrided toString method of Account class */
    @Override
    public String toString() {
        return "Checking account balance: " + getBalance();
    }
}
