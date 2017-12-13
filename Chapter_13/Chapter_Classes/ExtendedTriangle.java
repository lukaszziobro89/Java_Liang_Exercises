package Chapter_13.Chapter_Classes;
import Chapter_12.Chapter_Classes.IllegalTriangleException;
public class ExtendedTriangle extends AbstractGeometricObject{
    private double side1;
    private double side2;
    private double side3;

    // A no-arg constructor that creates a default triangle
    public ExtendedTriangle(){
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    // A constructor that creates a triangle with the specified side1, side2, and side3.
    public ExtendedTriangle(double side1, double side2, double side3) throws IllegalTriangleException{
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
            if (!isValid()){
                throw new IllegalTriangleException(side1,side2,side3);
            }
    }

    /** A method named getArea() that returns the area of this triangle. */
    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /** A method named getPerimeter() that returns the perimeter of this triangle. */
    public double getPerimeter(){
        return (side1 + side2 + side3);
    }

    /** A method that returns a string description for the triangle. */
    @Override
    public String toString(){
        return "ExtendedTriangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }

    /** A method returns true if triangle build from sides exists */
    public boolean isValid(){
        return((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1));
    }

    // The accessor methods for all three data fields
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}

