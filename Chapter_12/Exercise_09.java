package Chapter_12;
import Chapter_12.Chapter_Classes.BinaryFormatException;
/*
(BinaryFormatException) Exercise 12.7 implements the bin2Dec method to throw a BinaryFormatException if the
string is not a binary string. Define a custom exception called BinaryFormatException. Implement the bin2Dec
method to throw a BinaryFormatException if the string is not a binary string.
 */
public class Exercise_09 {
    public static void main(String[] args) {
        // correct
        System.out.println("Decimal number for 1110001 is " + bin2Dec("1110001"));
        // throw exception
        System.out.println(bin2Dec("asd"));

    }

    public static double bin2Dec(String binaryString) throws BinaryFormatException {
        if(!isBinary(binaryString)){
            throw new BinaryFormatException("This is not binary number.");
        }
        double decimal = 0;
        int power = 0;
        // iterate through all 0s and 1s in binary number
        for (int i = (binaryString.length() - 1); i >= 0; i--) {
            if (binaryString.charAt(i) == '1'){
                decimal += Math.pow(2,power);
            }
            power++;
        }
        return decimal;
    }

    /** Checks if provided string is binary number */
    public static boolean isBinary(String binary) {
        for (int i = (binary.length() - 1); i >= 0; i--) {
            if (binary.charAt(i) != '1' && binary.charAt(i) != '0'){
                return false;
            }
        }
        return true;
    }
}
