package Chapter_04;
import java.util.Scanner;
/*
(Days of a month) Write a program that prompts the user to enter a year and the first three letters
of a month name (with the first letter in uppercase) and displays the number of days in the month.
 */
public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for month and year
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Enter first 3 letters of month :");
        String month = input.nextLine();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = 0;

        if (month == "Jan" || month == "Mar" || month == "May" ||
                month == "Jul" || month == "Aug" || month == "Oct" || month == "Dec"){
            days = 31;
        } else if(month == "Apr" || month == "Jun" || month == "Sep" || month == "Nov"){
            days = 30;
        } else {
            days = isLeapYear ? 29 : 28;
        }
        System.out.println(month + " " + year + " had " + days + " days.");
    }
}