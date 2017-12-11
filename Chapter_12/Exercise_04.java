package Chapter_12;
/*
(IllegalArgumentException) Modify the Loan class in Listing 10.2 to throw IllegalArgumentException if the loan amount,
interest rate, or number of years is less than or equal to zero.
 */
public class Exercise_04 {
    public static void main(String[] args) {
        try{
            Loan loan1 = new Loan(-1,5,1000);
        } catch (IllegalArgumentException ex){
            System.out.println("Error message: " + ex.getMessage());
        }

        try{
            Loan loan2 = new Loan(1.5, -4, 2000);
        } catch (IllegalArgumentException ex){
            System.out.println("Error message: " + ex.getMessage());
        }

        try{
            Loan loan3 = new Loan(4.5, 7, -3000);
        } catch (IllegalArgumentException ex){
            System.out.println("Error message: " + ex.getMessage());
        }
    }
}

/** Loan class modified with exceptions */
class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /** Default constructor */
    public Loan() {
        this(2.5, 1, 1000);
    }

    /** Construct a loan with specified annual interest rate, number of years and loan amount
     */
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        if (annualInterestRate <= 0){
            throw new IllegalArgumentException("Interest Rate must be greater then 0.");
        }
        if (numberOfYears <=0 ){
            throw new IllegalArgumentException("Number of years must be greater then 0.");
        }
        if (loanAmount <= 0){
            throw new IllegalArgumentException("Loan amount must be greater then 0.");
        }
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new java.util.Date();
    }

    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Set a new annualInterestRate */
    public void setAnnualInterestRate(double annualInterestRate) {
        if(annualInterestRate <= 0){
            throw new IllegalArgumentException("Interest Rate must be greater then 0.");
        }
            this.annualInterestRate = annualInterestRate;
    }

    /** Return numberOfYears */
    public int getNumberOfYears() {
        return numberOfYears;
    }

    /** Set a new numberOfYears */
    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears <= 0){
            throw new IllegalArgumentException("Number of years must be greater then 0.");
        }
            this.numberOfYears = numberOfYears;
    }

    /** Return loanAmount */
    public double getLoanAmount() {
        return loanAmount;
    }

    /** Set a newloanAmount */
    public void setLoanAmount(double loanAmount) {
        if (loanAmount <= 0){
            throw new IllegalArgumentException("Loan amount must be greater then 0.");
        }
            this.loanAmount = loanAmount;
    }

    /** Find monthly payment */
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
        return monthlyPayment;
    }

    /** Find total payment */
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    /** Return loan date */
    public java.util.Date getLoanDate() {
        return loanDate;
    }
}

