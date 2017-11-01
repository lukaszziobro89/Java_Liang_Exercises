package Chapter_07;
/*
(Reverse an array) The reverse method in Section 7.7 reverses an array by copying it to a new array.
Rewrite the method that reverses the array passed in the argument and returns this array. Write a test
program that prompts the user to enter ten numbers, invokes the method to reverse the numbers, and displays the numbers.
 */
public class Exercise_12 {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};

        // print initial array
        System.out.println("Original array:");
        Exercise_01.printArray(numbers);

        // print reversed array
        System.out.println("\nReversed array:");
        Exercise_01.printArray(reverseArray(numbers));
    }

    /** Reverse array and return itself */
    public static int [] reverseArray(int[] inputArray){
        int temp;
        int j = inputArray.length - 1;
        for (int i = 0; i < inputArray.length / 2; i++) {
           temp = inputArray[i];            // put first element into temp variable
           inputArray[i] = inputArray[j];   // put last element into first index
           inputArray[j] = temp;            // put temp (first value) into last index
           j--;

        }
        return inputArray;
    }
}
