package Chapter_02;
import java.util.Scanner;
public class Exercise_02 {

/*
Compute the volume of a cylinder. Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:

	area = radius * radius * p
	volume = area * length
 */
	
	public static void main(String[] args) {
		final double pi = 3.14159265359;
		
		// 1. Create instance of scanner object
		Scanner input = new Scanner(System.in);
		
		// 2. Prompt user for radius value
		System.out.println("Please provide radius value: ");
		double radius_value = input.nextDouble();
				
		// 3. Prompt user for length of cylinder value
		System.out.println("Please provide cylinder length value: ");
		double length_value = input.nextDouble();
		
		// 4. Compute area and volume
		double area = radius_value * radius_value * pi;
		double volume = area * length_value;
		
		// 5. Print area and volume
		System.out.println("The area is: " + area);
		System.out.println("The volume is: " + volume);

	}

}
