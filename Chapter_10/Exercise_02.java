package Chapter_10;
import Chapter_10.Chapter_Classes.BMI;
/*
(The BMI class) Add the following new constructor in the BMI class:
Construct a BMI with the specified name, age, weight, feet, and inches public
BMI(String name, int age, double weight, double feet, double inches)
*/
public class Exercise_02 {
    public static void main(String[] args) {

        // create instance of BMI object
        BMI myBMI = new BMI("Lukasz", 28, 158, 67);

        // display results
        System.out.println(myBMI.getBMI());
        System.out.println(myBMI.getStatus());
    }
}
