package Chapter_03;
import java.util.Scanner;
/*
(Random month) Write a program that randomly generates an integer between 1 and 12 and displays the English
month name January, February, …, December for the number 1, 2, …, 12, accordingly.
 */
public class Exercise_04 {
    public static void main(String[] args) {

        // range for random
        int minimum = 1;
        int maximum = 12;

        // randomly generated number
        int randomNum = minimum + (int)(Math.random() * maximum);
        System.out.println("Randomly generated month number: " + randomNum);

        // switch case for month
        switch (randomNum){
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
        }
    }
}
