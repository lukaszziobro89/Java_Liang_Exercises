package Chapter_10.Chapter_Classes;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    // A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and 1 for both width and height.
    public MyRectangle2D(){
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    // A constructor that creates a rectangle with the specified x, y, width, and height.
    public MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /** Method getArea() that returns the area of the rectangle. */
    public double getArea(){
        return (width * height);
    }

    /** Method that returns the perimeter of the rectangle. */
    public double getPerimeter(){
        return 2 * (width + height);
    }

    /** Method that returns true if the specified point (x, y) is inside this rectangle */
    public boolean contains(double x, double y){
        return (x < getMaxX() && x > getMinX() && y < getMaxY() && y > getMinY()) ;
    }

    /** A method  that returns true if the specified rectangle is inside this rectangle */
    public boolean contains(MyRectangle2D r){
        return (this.getMaxX() > r.getMaxX() &&
                this.getMaxY() > r.getMaxY() &&
                this.getMinY() < r.getMinY() &&
                this.getMinX() < r.getMinX());
    }

    /** Method returns x (max) coordinate of right side of rectangle */
    public double getMaxX(){
        return (this.x + width / 2);
    }

    /** Method returns x (min) coordinate of left side of rectangle */
    public double getMinX(){
        return (this.x - width / 2);
    }

    /** Method returns y (max) coordinate of up side of rectangle */
    public double getMaxY(){
        return (this.y + height / 2);
    }

    /** Method returns y (min) coordinate of down side of rectangle */
    public double getMinY(){
        return (this.y - height / 2);
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
