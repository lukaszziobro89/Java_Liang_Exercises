package Chapter_17;
import Chapter_17.Chapter_Classes.Loan;
import java.io.*;
/*
(Restore objects from a file) Suppose a file has been created using the ObjectOutputStream. The file contains Loan objects.
Write a program that reads the Loan objects from the file and displays the total loan amount. Suppose you don’t
know how many Loan objects are there in the file, use EOFException to end the loop.
 */
public class Exercise_07 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        // create reference file to read
        File inputFile = new File("C:\\Users\\luq\\Desktop\\test\\Exercise17_06.dat");
        double totalLoanAmount = 0;

        // instantiate object input stream
        try(ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(inputFile)))){
            Loan loan;
            // in file there are only Loan objects so where reading it needs to be casted into Loan object
            while ((loan = (Loan)inputStream.readObject()) != null){
                totalLoanAmount += loan.getLoanAmount();
            }
        } catch (EOFException ex){
            System.out.println("End of file.");
        }
        System.out.println("Total amount: " + totalLoanAmount);
    }
}
