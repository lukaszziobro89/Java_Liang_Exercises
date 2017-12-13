package Chapter_13.Chapter_Classes;
public class Square extends AbstractGeometricObject implements Colorable{
    private double x;
    private double y;
    private double side;

    public Square(){
        this(0,0,1);
    }

    public Square(double x, double y, double side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    public Square(String color, boolean filled, double x, double y, double side) {
        super(color, filled);
        this.x = x;
        this.y = y;
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

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square sides: " + side;
    }

    @Override
    public double getArea() {
        return (side * side);
    }

    @Override
    public double getPerimeter() {
        return 2 * (side + side);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

}
