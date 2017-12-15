package Chapter_13.Chapter_Classes;

public class ComparableRectangle extends AbstractGeometricObject{
    private double width;
    private double height;

    public ComparableRectangle(){

    }

    public ComparableRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public ComparableRectangle(String color, boolean filled, double width, double height) {
//        super(color, filled);
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof ComparableRectangle && this.getArea() == ((ComparableRectangle) obj).getArea());
    }

//    @Override
//    public int compareTo(AbstractGeometricObject o) {
//        if ()
//    }

    @Override
    public String toString() {
        return "ComparableRectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double getArea() {
        return (width * height);
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
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
