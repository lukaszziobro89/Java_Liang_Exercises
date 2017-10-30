package Chapter_03;
import java.util.Scanner;
/*
Find future dates) Write a program that prompts the user to enter an integer for today’s day of the week
(Sunday is 0, Monday is 1, …, and Saturday is 6). Also prompt the user to enter the number of days after
today for a future day and display the future day of the week.
 */
public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for day
        System.out.println("0 is Monday, 6 is Saturday. Please provide today's day number: ");
        int day = input.nextInt();

        // prompt for delay
        System.out.println("Enter the number of days elapsed since today: ");
        int delay = input.nextInt();

        // calculate future day
        int elapsed_day = (day + delay) % 7;

        switch (day){
            case 0: System.out.print("Today is Sunday. "); break;
            case 1: System.out.print("Today is Monday. "); break;
            case 2: System.out.print("Today is Tuesday. "); break;
            case 3: System.out.print("Today is Wednesday. "); break;
            case 4: System.out.print("Today is Thursday. "); break;
            case 5: System.out.print("Today is Friday. "); break;
            case 6: System.out.print("Today is Saturday. "); break;
        }

        switch (elapsed_day){
            case 0: System.out.println("Future day is Sunday."); break;
            case 1: System.out.println("Future day is Monday."); break;
            case 2: System.out.println("Future day is Tuesday."); break;
            case 3: System.out.println("Future day is Wednesday."); break;
            case 4: System.out.println("Future day is Thursday."); break;
            case 5: System.out.println("Future day is Friday."); break;
            case 6: System.out.println("Future day is Saturday."); break;
        }

    }
}
