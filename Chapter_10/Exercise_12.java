package Chapter_10;
import Chapter_10.Chapter_Classes.MyPoint;
import Chapter_10.Chapter_Classes.Triangle2D;
/*
(Geometry: the Triangle2D class) Define the Triangle2D class that contains:
    ■ Three points named p1, p2, and p3 of the type MyPoint with getter and setter methods.
    ■ A no-arg constructor that creates a default triangle with the points (0, 0), (1, 1), and (2, 5).
    ■ A constructor that creates a triangle with the specified points.
    ■ A method getArea() that returns the area of the triangle.
    ■ A method getPerimeter() that returns the perimeter of the triangle.
    ■ A method contains(MyPoint p) that returns true if the specified point p is inside this triangle.
Write a test program that creates a Triangle2D objects t1 using the constructor
new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5)),
displays its area and perimeter, and displays the result. To detect whether a point is inside a triangle, draw three dashed lines.
If the point is inside a triangle, each dashed line should intersect a side only once.
If a dashed line intersects a side twice, then the point must be outside the triangle.
For the algorithm of finding the intersecting point of two lines, see Programming Exercise 3.25.)
*/
public class Exercise_12 {
    public static void main(String[] args) {
        // create objects
        Triangle2D triangle1 = new Triangle2D();
        MyPoint p1 = new MyPoint(2.5, 2);
        MyPoint p2 = new MyPoint(4.2, 3);
        MyPoint p3 = new MyPoint(5, 3.5);
        Triangle2D triangle2 = new Triangle2D(p1, p2, p3);
        Triangle2D triangle3 = new Triangle2D(1,2,3,4,5,6);

        // display results
        System.out.println(triangle1.isValid());
        System.out.println(triangle2.isValid());
        System.out.println(triangle1.getArea());
        System.out.println(triangle2.getArea());
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.contains(new MyPoint(2,1)));
        System.out.println(triangle3.isValid());


    }
}
