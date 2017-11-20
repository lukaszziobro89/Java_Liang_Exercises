/* (The Fan class) Design a class named Fan to represent a fan. The class contains:
    ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.
    ■ A private int data field named speed that specifies the speed of the fan (the default is SLOW).
    ■ A private boolean data field named on that specifies whether the fan is on (the default is false).
    ■ A private double data field named radius that specifies the radius of the fan (the default is 5).
    ■ A string data field named color that specifies the color of the fan (the default is blue).
    ■ The accessor and mutator methods for all four data fields.
    ■ A no-arg constructor that creates a default fan.
    ■ A method named toString() that returns a string description for the fan. If the fan is on, the method returns the
    fan speed, color, and radius in one combined string. If the fan is not on, the method returns the fan color and radius
    along with the string “fan is off” in one combined string.
Draw the UML diagram for the class and then implement the class. Write a test program that creates two Fan objects.
Assign maximum speed, radius 10, color yellow, and turn it on to the first object. Assign medium speed, radius 5, color
blue, and turn it off to the second object. Display the objects by invoking their toString method. */
package Chapter_09;
import Chapter_09.Chapter_Classes.Fan;
public class Exercise_08 {
    public static void main(String[] args) {

        // create two Fan objects
        Fan firstFan = new Fan();
        Fan secondFan = new Fan();

        // change settings for first fan
        firstFan.setSpeed(3);
        firstFan.setRadius(10);
        firstFan.setColor("Yellow");
        firstFan.setOn(true);

        // change settings for second fan
        secondFan.setSpeed(2);
        secondFan.setRadius(5);
        secondFan.setColor("Blue");

        // invoke toString method for both objects
        System.out.println(firstFan.toString());
        System.out.println(secondFan.toString());
    }
}
