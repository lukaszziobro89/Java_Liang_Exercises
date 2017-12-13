package Chapter_13;
import Chapter_13.Chapter_Classes.ExtendedTriangle;
/*
(Enable GeometricObject comparable) Modify the GeometricObject class to implement the Comparable interface,
and define a static max method in the GeometricObject class for finding the larger of two GeometricObject objects.
Write a test program that uses the max method to find the larger two triangles.
 */
public class Exercise_05 {
    public static void main(String[] args) {
        // create instances of ExtendedTriangle which inherits from AbstractGeometricObject
        ExtendedTriangle t1 = new ExtendedTriangle(5,5,5);
        ExtendedTriangle t2 = new ExtendedTriangle(6,6,6);

        // compareTo method returns 1 if t1 > t2 and -1 if t1 < t2
        System.out.println(t1.compareTo(t2));
    }
}
