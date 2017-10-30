package Chapter_07.other_functions;
import java.util.Scanner;
public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for numbers and create array
        System.out.println("Enter number of elements: ");
        int n = input.nextInt();
        double [] numbers = new double[n];
        double sum = 0;

        // enter numbers and sum elements
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++){
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        // calculate average
        double average = sum / n;

        // count elements above average
        int aboveAverageCounter = 0;
        for (int i=0; i < n; i++){
            if (numbers[i] > average){
                aboveAverageCounter++;
            }
        }

        System.out.println("Average is " + average);
        System.out.println("Number of elements above average: " + aboveAverageCounter);
    }
}
