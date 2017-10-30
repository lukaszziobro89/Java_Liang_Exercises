package Chapter_05;
/*
Financial application: compute future tuition) Suppose that the tuition for a university is $10,000
this year and increases 5% every year. In one year, the tuition will be $10,500.
Write a program that computes the tuition in ten years and the total cost of four years’
worth of tuition after the tenth year.
 */
public class Exercise_07 {
    public static void main(String[] args) {

        //variables
        double tuition = 10000;
        double fourTuition =0;
        double fourYearCost = 0;
        int year = 0;

        for (int i=1; i<=10; i++){
            tuition *= 1.05;

            if (i==4){
                fourTuition = tuition;
                fourYearCost = fourTuition - 10000;
            }
        }

        // display results
        System.out.printf("Four years tuition: %1.2f\n", fourTuition);
        System.out.printf("Four years cost: %1.2f\n", fourYearCost);
        System.out.printf("Ten years: %1.2f\n", tuition);
    }
}
