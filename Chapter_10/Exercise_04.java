package Chapter_10;
import Chapter_10.Chapter_Classes.MyPoint;
/*
(The MyPoint class) Design a class named MyPoint to represent a point with x- and y-coordinates. The class contains:
    ■ The data fields x and y that represent the coordinates with getter methods.
    ■ A no-arg constructor that creates a point (0, 0).
    ■ A constructor that constructs a point with specified coordinates.
    ■ A method named distance that returns the distance from this point to a specified point of the MyPoint type.
    ■ A method named distance that returns the distance from this point to another point with specified x- and y-coordinates.
Write a test program that creates the two points (0, 0) and (10, 30.5) and displays the distance between them.
 */
public class Exercise_04 {
    public static void main(String[] args) {

        // create two MyPoint objects
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10,30.5);


        // invoke non-static method from object of class
        System.out.println("Distance between point1 and point2: "+ point1.distance(point2));

        // invoke static method directly from class
        System.out.println("Distance between point1 and point2: "+ MyPoint.distance(point1, point2));

    }
}
