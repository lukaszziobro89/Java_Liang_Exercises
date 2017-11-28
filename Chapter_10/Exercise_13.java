package Chapter_10;
import Chapter_10.Chapter_Classes.MyRectangle2D;
/*
(Geometry: the MyRectangle2D class) Define the MyRectangle2D class that contains:
■ Two double data fields named x and y that specify the center of the rectangle with getter and setter methods.
(Assume that the rectangle sides are parallel to x- or y- axes.)
■ The data fields width and height with getter and setter methods.
■ A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and 1 for both width and height.
■ A constructor that creates a rectangle with the specified x, y, width, and height.
A method getArea() that returns the area of the rectangle.
■ A method getPerimeter() that returns the perimeter of the rectangle.
■ A method contains(double x, double y) that returns true if the specified point (x, y) is inside this rectangle (see Figure 10.24a).
■ A method contains(MyRectangle2D r) that returns true if the specified rectangle is inside this rectangle (see Figure 10.24b).
■ A method overlaps(MyRectangle2D r) that returns true if the specified rectangle overlaps with this rectangle (see Figure 10.24c).
Write a test program that creates a MyRectangle2D object  r1 (new MyRectangle2D(2, 2, 5.5, 4.9)),
displays its area and perimeter, and displays the result of r1.contains(3, 3)
 */
public class Exercise_13 {
    public static void main(String[] args) {
        MyRectangle2D myRec1 = new MyRectangle2D(0,0,4,4);
        MyRectangle2D myRec2 = new MyRectangle2D();
        System.out.println(myRec1.getArea());
        System.out.println(myRec1.getPerimeter());
        System.out.println(myRec1.getMaxX());
        System.out.println(myRec1.getMinX());
        System.out.println(myRec1.contains(1,1));
        System.out.println(myRec1.contains(-5,-5));
        System.out.println(myRec1.contains(10,10));
        System.out.println(myRec1.contains(new MyRectangle2D(0,0,2,2)));
        System.out.println(myRec1.contains(new MyRectangle2D(0,0,5,5)));
        System.out.println(myRec1.contains(new MyRectangle2D(0,0,5,1)));
        System.out.println(myRec1.contains(new MyRectangle2D(0,0,1,2)));
        System.out.println(myRec2.contains(myRec1));

    }
}
