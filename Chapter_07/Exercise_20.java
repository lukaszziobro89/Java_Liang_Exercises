package Chapter_07;

import java.util.Scanner;

/* (Revise selection sort) In Section 7.11, you used selection sort to sort an array. The selection-sort method
repeatedly finds the smallest number in the current array and swaps it with the first. Rewrite this program by
finding the largest number and swapping it with the last. Write a test program that reads in ten double
numbers, invokes the method, and displays the sorted numbers.*/
public class Exercise_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numbers[] = new int[10];
        System.out.println("Please provide ten integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.print("\nOriginal array: ");
        Exercise_01.printArray(numbers);
        selectionSortDescending(numbers); // sort in decreased order
        System.out.print("\nArray sorted in decreased order: ");
        Exercise_01.printArray(numbers);

    }

    /** Sort list in descending order using selection sort */
    public static void selectionSortDescending(int[] list){

        for (int i = 0; i < list.length - 1; i++) {
            int currentMax = list[i];
            int currentMaxIndex = i;

            // loop through end of list to compare current max with all values - change max if required
            for (int j = i + 1; j < list.length; j++) {
                if(list[j] > currentMax){
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

                if (currentMaxIndex != i){
                    list[currentMaxIndex] = list[i];
                    list[i] = currentMax;

                }
        }
    }
}
