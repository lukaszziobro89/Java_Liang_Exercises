package Chapter_12.Chapter_Classes;
import java.util.Scanner;
public class Hex2Dec {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number "
                + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    public static boolean isHexadecimal(String s){
        for (int i = 0; i < s.length(); i++) {
             if (!isCharAtRange(s.charAt(i),'0','9') && !isCharAtRange(s.charAt(i),'A','F')){
                 return false;
             }
        }
        return true;
    }

    public static boolean isCharAtRange(char ch, char start, char end) {
        return !(ch < start || ch > end);
    }

    public static int hexToDecimal(String hex) throws NumberFormatException{
        if (!isHexadecimal(hex)){
            throw new NumberFormatException("Not hexadecimal number.");
        }
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else // ch is '0', '1', ..., or '9'
            return ch - '0';
    }
}
