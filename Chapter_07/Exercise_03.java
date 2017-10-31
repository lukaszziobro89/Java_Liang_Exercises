package Chapter_07;
import java.util.Scanner;
/*
Count occurrence of numbers) Write a program that reads the integers between 1 and 100 and counts the
occurrences of each. Assume the input ends with 0. Here is a sample run of the program:
Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
 */
public class Exercise_03 {
    public static void main(String[] args) {

        // initialize with 100 of elements with value = 0
        int numbers[] = new int[100];
        // print whole array
        Exercise_01.printArray(numbers);
        // prompt for integers
        System.out.print("\nEnter integers between 1 and 100 (input ends with 0) :");
        // Count occurences - as it is array of zeros, each increase works like counter
        countOccurrences(numbers);

        // print counters
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0){
                System.out.println((i+1) + " occurs " + numbers[i] +
                " time" + (numbers[i]>1 ? "s" : ""));
            }
        }
    }

    /** If user enters integer number - increase +1 relevant element in table */
    public static void countOccurrences(int[] counters){
        Scanner input = new Scanner(System.in);
        int num;
        do {
            num = input.nextInt();
            if(num >=1 && num <= 100){
                counters[num - 1]++;     // increase nth element using index
            }
        } while (num != 0);
    }
}
