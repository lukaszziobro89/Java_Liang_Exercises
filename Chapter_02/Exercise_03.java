package Chapter_02;
import java.util.Scanner;
public class Exercise_03 {

/*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter.
*/

	public static void main(String[] args) {
		final double meters_feet_transform = 0.305;
		
		// 1. Create instance of scanner object
		Scanner input = new Scanner(System.in);
				
		// 2. Prompt user for feet value
		System.out.println("Please provide feet value: ");
		double feet_value = input.nextDouble();
		
		// 3. Calculate meters
		double meters_value = feet_value * meters_feet_transform;
		
		// 4. Print meters value
		System.out.println(feet_value + " feet is " + meters_value + " meters.");
	}

}
