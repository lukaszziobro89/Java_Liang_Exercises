package Chapter_10.Chapter_Classes;

public class MyPoint {
    //fields / attributes
    private double x;
    private double y;

    // no-arg constructor
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    // constructor that constructs a point with specified coordinates
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /** A method named distance that returns the distance from this point to another point with specified x- and y-coordinates.*/
    public double distance(double x, double y){
        return Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y - y),2));
    }

    /** A method named distance that returns the distance from this point to a specified point of the MyPoint type. */
    public double distance(MyPoint myPoint){
        return distance(myPoint.x, myPoint.y);
    }

    /** Static method that returns distance between two points */
    public static double distance(MyPoint myPoint1, MyPoint myPoint2){
        return myPoint1.distance(myPoint2);
    }



}
