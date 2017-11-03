package Chapter_07;

import java.util.Scanner;

/*
(Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubblesort algorithm makes several
passes through the array. On each pass, successive neighboring pairs are compared. If a pair is not in order,
its values are swapped; otherwise, the values remain unchanged. The technique is called a bubble sort or
sinking sort because the smaller values gradually “bubble” their way to the top and the larger values “sink” to
the bottom. Write a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
 */
public class Exercise_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[10];

        // prompt for ten integer numbers
        System.out.print("Put 10 integer numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // print unsorted array
        System.out.print("Unsorted array: ");
        Exercise_01.printArray(numbers);
        bubbleSort(numbers);
        System.out.print("\nSorted array: ");
        Exercise_01.printArray(numbers);

    }

    /** Sort input array using bubble sort */
    public static void bubbleSort(int [] inputArray){
        int n = inputArray.length;
        int temp;
        // do sorting until loop moves to beginning
        do {
            //
            for (int i = 0; i < inputArray.length - 1; i++) {
                // swap if n'th element is larger then (n'th + 1) element
                if (inputArray[i] > inputArray[i + 1]){
                    temp = inputArray[i+1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = temp;
                }
            }
            n = n - 1;   // largest element is at the end so no need to check it again
        } while (n > 1);
    }
}
