package Chapter_06;
/*
(Conversions between feet and meters) Write a class that contains the following two methods:
Convert from feet to meters: public static double footToMeter(double foot)
Convert from meters to feet: public static double meterToFoot(double meter)
The formula for the conversion is:
        meter = 0.305 * foot
        foot = 3.279 * meter
Write a test program that invokes these methods to display the following tables:

Feet    Meters      |       Meters      Feet
1.0      0.305      |       20.0        65.574
2.0      0.610      |       25.0        81.967
...
9.0      2.745      |       60.0        196.721
10.0     3.050      |       65.0        213.115
 */
public class Exercise_09 {
    public static void main(String[] args) {
        // print headers
        System.out.printf("%5s%10s | %5s%9s", "Feet", "Meters", "Meters", "Feet\n");

        for (double feet = 1, meters=20; feet <=10; feet++, meters +=5){
            System.out.printf("%5.2f%10.2f | %5.2f%10.2f\n",
                    feet, footToMeter(feet), meters, meterToFoot(meters));
        }

    }

    /** Method that converts foot to meter */
    public static double footToMeter(double foot){
        return (0.305 * foot);
    }

    /** Method that converts meter to  foot */
    public static double meterToFoot(double meter){
        return (3.279 * meter);
    }

}
