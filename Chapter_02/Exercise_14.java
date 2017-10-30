package Chapter_02;
import java.util.Scanner;
/*
(Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 */
public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for weight and height
        System.out.println("Please provide weight in pounds:");
        double weight = input.nextDouble();
        System.out.println("Please provide height in pounds:");
        double height = input.nextDouble();

        double weight_kg = weight * 0.45359237;
        double height_m = height * 0.0254;

        // calculations
        double BMI = weight_kg / (height_m*height_m);

        // display results
        System.out.println("BMI: " + BMI);

    }
}
