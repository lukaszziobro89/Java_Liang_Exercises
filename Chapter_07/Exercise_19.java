package Chapter_07;

import java.util.Scanner;

/*
(Sorted?) Write the following method that returns true if the list is already sorted in increasing order.

public static boolean isSorted(int[] list)

Write a test program that prompts the user to enter a list and displays whether the list is sorted or not.
Here is a sample run. Note that the first number in the input indicates the number of the elements in the list.
This number is not part of the list.
Enter list: 8 10 1 5 16 61 9 11 1
The list is not sorted
 */
public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list, first number is size of list: ");
        int size = input.nextInt();     // get size of list (don't go to next line)
        int numbers[] = new int[size];  // create array with numbers
        // input numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // check if list is sorted
        if (isSorted(numbers)){
            System.out.println("List is sorted.");
        } else {
            System.out.println("List is not sorted.");
        }
    }

    /** Return true if provided list is sorted nad false if not */
    public static boolean isSorted(int[] list){
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]){
                return false;
            }
        }
        return true;
    }
}
