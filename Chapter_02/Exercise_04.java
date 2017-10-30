package Chapter_02;
import java.util.Scanner;
public class Exercise_04 {

/*
(Convert pounds into kilograms) Write a program that converts pounds into kilograms.
The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result. 
One pound is 0.454 kilograms.
 */
	
	public static void main(String[] args) {
		double pound_to_kilogram = 0.454;
		
		// 1. Create instance of scanner object
		Scanner input = new Scanner(System.in);
		
		// 2. Prompt user for pound value
		System.out.println("Please provide pounds value: ");
		double pound_value = input.nextDouble();
		
		// 3. Convert pounds to kilograms
		double kilograms = pound_value * pound_to_kilogram;
		
		// 4. Print result 
		System.out.println(pound_value + " pounds is " + kilograms + " kilograms.");
 
	}

}
