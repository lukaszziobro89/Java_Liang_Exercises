package Chapter_12;
import java.util.Scanner;
import Chapter_12.Chapter_Classes.Hex2Dec;
/*
(NumberFormatException) Listing 6.8 implements the hex2Dec(String hexString) method, which converts a hex string into a decimal number.
Implement the hex2Dec method to throw a NumberFormatException if the string is not a hex string.
 */
public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        String hex = "";
        int decimal = 0;

        while (!isValid){
            try{
                System.out.println("Put hexadecimal number: ");
                hex = input.nextLine();
                decimal = Chapter_12.Chapter_Classes.Hex2Dec.hexToDecimal(hex);
                isValid = true;
            } catch (NumberFormatException ex){
                System.out.println(ex.getLocalizedMessage());
                System.out.println("Not hexadecimal! Try again...");
            }
        }
        System.out.println("Decimal: " + decimal);
    }
}
