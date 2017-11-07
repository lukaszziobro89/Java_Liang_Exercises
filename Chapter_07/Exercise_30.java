package Chapter_07;
import java.util.Scanner;
/*
(Pattern recognition: consecutive four equal numbers) Write the following method that tests whether the array has
four consecutive numbers with the same value.

public static boolean isConsecutiveFour(int[] values)

Write a test program that prompts the user to enter a series of integers and displays if the series contains four
consecutive numbers with the same value. Your program should first prompt the user to enter the input size—i.e.,
the number of values in the series
 */
public class Exercise_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create array for numbers
        int numbers[] = new int[10];
        System.out.println("Put numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // invoke the method to check
        boolean check = isConsecutiveFour(numbers);

        // display results
        System.out.println("The list" + (check ? " has" : " has not") + " 4 consecutive values.");

    }

    /** Returns true if there are 4 consecutive values */
    public static boolean isConsecutiveFour(int[] values){
        int counter=0;
        // end if there is less then 4 elements in array
        if (values.length < 4){
            return false;
        }
        // for each element to (length - 4) check if next four are
        for (int i = 0; i <= values.length - 4; i++) {
            for (int j = i + 1; j <= i + 3; j++) {
                if (values[i] == values[j]){
                    counter++;
                }
                if (counter == 3){
                    return true;
                }
            }
            counter = 0;
        }
        return false;
    }
}
