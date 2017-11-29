/*
(Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3.
 */
package Chapter_10;
import java.math.BigDecimal;
public class Exercise_16 {
    public static void main(String[] args) {

        // create big number
        String bigNumber = "" + 1;
        for (int i = 0; i < 49; i++) {
            bigNumber += "0";
        }
        System.out.println(bigNumber);
        BigDecimal bigDecimal = new BigDecimal(bigNumber);

        int counter = 0;
        while (counter < 10){
            // remainder of dividing big number by 2 or 3
            BigDecimal reminder2 = bigDecimal.remainder(new BigDecimal(2));
            BigDecimal reminder3 = bigDecimal.remainder(new BigDecimal(3));
                // if reminder remainder of dividing big number by 2 or 3 is 0 then print
                if ((reminder2.equals(BigDecimal.ZERO) || reminder3.equals(BigDecimal.ZERO))){
                    System.out.println(bigDecimal);
                    counter++;
                }
            bigDecimal = bigDecimal.add(BigDecimal.ONE);
        }
    }
}
