package Chapter_09.Chapter_Classes;

public class Rectangle {
    // fields
    private double width;
    private double height;

    // default no-arg constructor
    public Rectangle(){
        width = 1;
        height = 1;
    }

    // constructor which creates rectangle
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    // getter (accessor) for width
    public double getWidth() {
        return width;
    }

    // setter (mutator) for width
    public void setWidth(double width) {
        this.width = width;
    }

    // getter (accessor) for height
    public double getHeight(){
        return height;
    }

    // setter (mutator) for height
    public void setHeight(double height){
        this.height = height;
    }

    /** Method that returns area of rectangle */
    public double getArea(){
        return width * height;
    }

    /** Method that returns perimeter of rectangle */
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
