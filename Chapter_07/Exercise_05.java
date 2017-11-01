package Chapter_07;
import java.util.Scanner;
/*
(Print distinct numbers) Write a program that reads in ten numbers and displays the number of distinct numbers
and the distinct numbers separated by exactly one space (i.e., if a number appears multiple times, it is displayed
only once). (Hint: Read a number and store it to an array if it is new. If the number is already in the
array, ignore it.) After the input, the array contains the distinct numbers. Here is the sample run of the program:
Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The number of distinct number is 6
The distinct numbers are: 1 2 3 6 4 5
 */
public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j=0;

        // create 10 elements array and put elements into it
        int numbers[] = new int[10];
        System.out.println("Put 10 integer numbers: ");
        for (int i = 0; i < numbers.length - 1; i++) {
            int num = input.nextInt();
            if (alreadyInArray(numbers, num)){
                numbers[j] = num;
                j++;
            }
        }
        // print whole array
        System.out.println("Whole array (with zeros): ");
        Exercise_01.printArray(numbers);

        // count distinct elements
        int distinctCounter = countDistinct(numbers);
        System.out.println("\nNumber of distinct elements: " + distinctCounter);

        // print distinct elements
        System.out.print("Distinct elements: ");
        printPositives(numbers);
    }

    /** Print all elements from array wi */
    private static void printPositives(int inputArray[]) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] > 0){
                System.out.print(inputArray[i] + " ");
            }
        }
    }

    /** Counts number of elements in array which are greater then 0 */
    private static int countDistinct(int inputArray[]) {
        int counter = 0;
        for (int i = 0; i < inputArray.length -1; i++) {
            if (inputArray[i] > 0){
                counter++;
            }
        } return counter;
    }

    /** Check if number is in inputArray - iterate through array and return true or false */
    private static boolean alreadyInArray(int[] inputArray, int number){
        for (int i=0; i <= inputArray.length -1; i++){
            if (inputArray[i] == number){
                return false;
            }
        } return true;
    }
}
