package Chapter_17;
import Chapter_17.Chapter_Classes.Loan;

import java.io.*;

/*
(Store Loan objects) The Loan class in Listing 10.2 does not implement Serializable.
Rewrite the Loan class to implement Serializable.
Write a program that creates five Loan objects and stores them in a file named Exercise17_06.dat.
 */
public class Exercise_06 {
    public static void main(String[] args) throws IOException{
        Loan loan_1 = new Loan(0.2,5,7000);
        Loan loan_2 = new Loan(0.3,2,5000);
        Loan loan_3 = new Loan(0.4,3,1000);
        Loan loan_4 = new Loan(0.5,1,2000);
        Loan loan_5 = new Loan(0.1,7,3000);

        File outputFile = new File("C:\\Users\\luq\\Desktop\\test\\Exercise17_06.dat");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(outputFile)))){
            objectOutputStream.writeObject(loan_1);
            objectOutputStream.writeObject(loan_2);
            objectOutputStream.writeObject(loan_3);
            objectOutputStream.writeObject(loan_4);
            objectOutputStream.writeObject(loan_5);
        }

    }
}
