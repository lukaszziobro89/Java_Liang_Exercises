package Chapter_02;
import java.util.Scanner;
public class Exercise_01 {

/*
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:

    fahrenheit = (9 / 5) * celsius + 32
 */

	public static void main(String[] args) {
		// 1. Create new scanner
		Scanner input = new Scanner(System.in);
		
		// 2. Prompt user to input double value of Celsius degree
		System.out.print("Please provide Celsius degree: ");
		double celsius_value = input.nextDouble();
		
		// 3. Convert to Fahrenheit degree
		double fahrenheit_value = (9.0 / 5) * celsius_value + 32;
		
		// 4. Display result
		System.out.println("Celsius = " + celsius_value + " is equal to " + fahrenheit_value + " degree.");

	}
}
