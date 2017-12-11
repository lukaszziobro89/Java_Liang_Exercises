package Chapter_12;
import Chapter_12.Chapter_Classes.Loan;
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