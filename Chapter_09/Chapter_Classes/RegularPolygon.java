package Chapter_09.Chapter_Classes;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    // no-arg constructor
    public RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    // constructor with default x=0 nad y=0
    public RegularPolygon(int numberOfSides, double sideLength){
        this.n = numberOfSides;
        this.side = sideLength;
    }

    // constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
    public RegularPolygon(int numberOfSides, double sideLength, double x, double y){
        this.n = numberOfSides;
        this.side = sideLength;
        this.x = x;
        this.y = y;
    }

    /** The method returns the perimeter of the polygon. */
    public double getPerimeter(){
        return n * side;
    }

    /** The method returns area of the polygon */
    public double getArea(){
        return ((getN() * Math.pow(getSide(), 2)) / (4 * (Math.tan(Math.PI / getN()))));
    }

    // accessors and mutators
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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
}
