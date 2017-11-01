package Chapter_07;
import java.util.Scanner;
/*
(Statistics: compute deviation) Programming Exercise 5.45 computes the standard deviation of numbers.
This exercise uses a different but equivalent formula to compute the standard deviation of n numbers.
mean = (sum [i=1 -> n] (Xi) )/ n
deviation = sqrt((sum [i=1 -> n] ((Xi - mean)^2)) / (n - 1))
To compute the standard deviation with this formula, you have to store the individual
numbers using an array, so that they can be used after the mean is obtained.
Your program should contain the following methods:
Compute the deviation of double values: public static double deviation(double[] x)
Compute the mean of an array of double values : public static double mean(double[] x)
Write a test program that prompts the user to enter ten numbers and displays the
 */
public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // put numbers into array
        double numbers[] = new double[10];
        System.out.println("Put 10 double numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // display results
        System.out.printf("\nMean = %3.2f", mean(numbers));
        System.out.printf("\nStandard deviation = %3.5f", deviation(numbers));
    }

    /** Compute the deviation of double values */
    public static double deviation(double[] x){
        double meanFromArray = mean(x); // calculate mean value for provided array numbers
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow((x[i] - meanFromArray), 2); // sum up all elements
        }
        return (Math.sqrt(sum / (x.length - 1)));
    }

    /** Compute the mean of an array of double values */
    public static double mean(double[] x){
        double sum=0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];    // sum all array elements
        }
        return (sum / x.length);
    }
}
