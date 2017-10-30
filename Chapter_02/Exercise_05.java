package Chapter_02;
import java.util.Scanner;
public class Exercise_05 {

/*
(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
*/
	
	public static void main(String[] args) {
		double subtotal;
		double gratuity_rate;
		double total;
		double gratuity;
		
		// 1. Create instance of scanner object
		Scanner input = new Scanner(System.in);
		
		// 2. Prompt user for subtotal
		System.out.println("Please provide subtotal value: ");
		subtotal = input.nextDouble();
		
		// 3. Prompt user for gratuity rate
		System.out.println("Please provide gratuity rate value: ");
		gratuity_rate = input.nextDouble();
		
		// 4. Calculate gratuity and total
		gratuity = subtotal * (gratuity_rate / 100);
		total  = subtotal + gratuity;
		
		// 5. Print values
		System.out.println("The gratuity is " + gratuity +  " and total is " + total);

	}

}
