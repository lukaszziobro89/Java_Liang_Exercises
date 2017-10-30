package Chapter_01;

import java.util.ArrayList;
import java.util.List;

/*
(Population projection) The U.S. Census Bureau projects population based on the
following assumptions:
- One birth every 7 seconds
- One death every 13 seconds
- One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume the
current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
integers perform division, the result is an integer. The fractional part is truncated. For
example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
the fractional part, one of the values involved in the division must be a number with a
decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */
public class Exercise_11 {
    public static void main(String[] args) {
        int current_population = 312032486;

        ArrayList<Object> years = new ArrayList();


        // calculations
        double year_1 = current_population + 1 *((31536000.0 / 7) - (31536000.0 / 13) + (31536000.0 / 45));
        years.add(year_1);
        double year_2 = current_population + 2 *((31536000.0 / 7) - (31536000.0 / 13) + (31536000.0 / 45));
        years.add(year_2);
        double year_3 = current_population + 3 *((31536000.0 / 7) - (31536000.0 / 13) + (31536000.0 / 45));
        years.add(year_3);
        double year_4 = current_population + 4 *((31536000.0 / 7) - (31536000.0 / 13) + (31536000.0 / 45));
        years.add(year_4);
        double year_5 = current_population + 5 *((31536000.0 / 7) - (31536000.0 / 13) + (31536000.0 / 45));
        years.add(year_5);

        System.out.println(year_1);
        System.out.println(year_5);
        // displaying
        for (int i = 0; i < 5; i++){
            System.out.println("Prediction for year " + i + " :" + years.get(i));
        }
    }
}
