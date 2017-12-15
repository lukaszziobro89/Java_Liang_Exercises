package Chapter_13;
import Chapter_13.Chapter_Classes.AbstractGeometricObject;
import Chapter_13.Chapter_Classes.ComparableRectangle;

/*
(Sum the areas of geometric objects) Write a method that sums the areas of all the geometric objects in an array. The method signature is:
    public static double sumArea(GeometricObject[] a)
Redesign the Rectangle class. Write a test program that creates an array of four objects (two circles and two
rectangles) and computes their total area using the sumArea method.
 */
public class Exercise_12 {
    public static void main(String[] args) {
        AbstractGeometricObject[] a = new AbstractGeometricObject[3];
        ComparableRectangle rec1 = new ComparableRectangle(2,3);
        ComparableRectangle rec2 = new ComparableRectangle(4,5);
        AbstractGeometricObject objects[] = new AbstractGeometricObject[2];
        objects[0] = rec1;
        objects[1] = rec2;
        System.out.println("Sum of areas: "+ sumArea(objects));
    }

    /** Sums area of all instances of AbstractGeometricObject in a array */
    public static double sumArea(AbstractGeometricObject[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}
