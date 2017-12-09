package Chapter_11.Chapter_Classes;
import Chapter_09.Chapter_Classes.Account;
public class SavingsAccount extends Account {
    protected double OVERDRAFT_LIMIT = 0;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(int id, double amount){
        super(id, amount);
    }

    /** Overrided method of Account class */
    @Override
    public void withdraw(double amount){
        if (getBalance() - amount >= OVERDRAFT_LIMIT){
            super.withdraw(amount);
        }
    }

    /** Overrided toString method of Account class */
    @Override
    public String toString() {
        return "Savings account balance: " + getBalance();
    }
}
