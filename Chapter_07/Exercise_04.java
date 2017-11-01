package Chapter_07;
import java.util.Scanner;
/*
(Analyze scores) Write a program that reads an unspecified number of scores and determines how many scores
are above or equal to the average and how many scores are below the average. Enter a negative number to
signify the end of the input. Assume that the maximum number of scores is 100.
 */
public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variables
        final int MAX = 100;
        int scores[] = new int[100];
        int num;
        int i;
        int sum = 0;
        double average;
        int aboveAverage = 0;
        int belowAverage = 0;
        int numberOfElements=0;

        // input elements until number is positive
        System.out.println("Put scores (negative number ends input): ");
        for (i=0; i<100; i++){
            // loop until negative number entered
            num = input.nextInt();
            if (num <0){
                break;
            } else {
                scores[i] = num;    // put element into array
                i++;                // increase counter
                sum += num;         // add number to sum of elements
                numberOfElements++;
            }
        }

        // calculate average number of elements above average / below average
        average = sum / numberOfElements;
        for (int j = 0; j < scores.length; j++) {
            if (scores[j] >= average){
                aboveAverage++;
            } else if (scores[j] > 0 && scores[j] < average){
                belowAverage++;
            }
        }

        // calculate above and below average
        System.out.println("Average is: " + average);
        System.out.println("All elements: ");
        // print all elements of array
        for (int j = 0; j < scores.length; j++) {
            if (scores[j] > 0){
            System.out.print(scores[j] + " ");
            }
        }
        System.out.println("\nNumber of elements above or equal average: " + aboveAverage);
        System.out.println("Number of elements below average: " + belowAverage);
    }
}
