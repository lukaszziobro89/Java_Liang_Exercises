package Chapter_10.Chapter_Classes;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    // no-arg constructor creates default circle with radius = 1
    public Circle2D(){
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    // A constructor that creates a circle with the specified x, y, and radius.
    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /** Method that returns the area of the circle. */
    public double getArea(){
        return (Math.PI * Math.pow(radius, 2));
    }

    /** Method that returns the perimeter of the circle */
    public double getPerimeter(){
        return (2 * Math.PI * radius);
    }

    /** Method that returns true if the specified point (x, y) is inside this circle. */
    public boolean contains(double x, double y){
        return (Math.pow((getX() - x), 2) + Math.pow((getY() - y), 2) == Math.pow(getRadius(), 2));
    }

    /** Method that returns true if the specified circle is inside this circle. */
    public boolean contains(Circle2D circle){
        double centersDistance = distance(this.getX(), this.getY(), circle.x, circle.y);
            if (centersDistance + circle.radius < this.radius){
                return true;
            } else {
                return false;
            }
    }

    /** Computes distance between to points */
    public double distance(double x1, double y1, double x2, double y2){
        double distance;
        distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    /** Method that returns true if the specified circle overlaps with this circle. */
    public boolean overlaps(Circle2D circle){
        double centersDistance = distance(this.getX(), this.getY(), circle.x, circle.y);
        if((centersDistance < this.radius + circle.radius) && (centersDistance > Math.abs(this.radius - circle.radius))){
            return true;
        } else {
            return false;
        }
    }

    // getters for attributes
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
}
