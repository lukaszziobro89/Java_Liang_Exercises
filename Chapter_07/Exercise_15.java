package Chapter_07;
import java.util.Scanner;
/*
(Eliminate duplicates) Write a method that returns a new array by eliminating the duplicate values in the array using
the following method header:

public static int[] eliminateDuplicates(int[] list)

Write a test program that reads in ten integers, invokes the method, and displays the result.
 */
public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // put numbers into array
        int numbers[] = new int[10];
        System.out.println("Put 10 double numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        Exercise_01.printArray(eliminateDuplicates(numbers));

    }

    /** Returns new array with distinct elements from input array */
    public static int[] eliminateDuplicates(int[] list){
        int tempArray[] = new int[list.length];
        int j=0;
        for (int i = 0; i < list.length; i++) {
            if (linearSearch(tempArray, list[i]) == -1){
                tempArray[j] = list[i];
                j++;
            }
        }
        // trim temp array into distinct
        int distinctArray[] = new int[j];
        for (int i = 0; i <= j-1; i++) {
            distinctArray[i] = tempArray[i];
        }
        return distinctArray;
    }

     /** The method for finding a key in the list */
     public static int linearSearch(int[] list, int key) {
         for (int i = 0; i < list.length; i++) {
             if (key == list[i])
                 return i;
         }
         return -1;
     }
}

