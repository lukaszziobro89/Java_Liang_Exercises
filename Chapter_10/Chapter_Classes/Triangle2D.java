package Chapter_10.Chapter_Classes;
public class Triangle2D {
    public MyPoint p1;
    public MyPoint p2;
    public MyPoint p3;

    // A no-arg constructor that creates a default triangle with the points (0, 0), (1, 1), and (2, 5).
    public Triangle2D(){
        this.p1 = new MyPoint(0,0);
        this.p2 = new MyPoint(1,1);
        this.p3 = new MyPoint(2,5);
    }

    // constructor that creates triangle with specified points
    public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3){
        if (isValid(x1, y1, x2, y2, x3, y3)){
            this.p1 = new MyPoint(x1, y1);
            this.p2 = new MyPoint(x2, y2);
            this.p3 = new MyPoint(x3, y3);
        }
    }

    /** Method checks if it is possible to build triangle using three provided points*/
    public boolean isValid(){
        if(p1 != null && p2 != null && p3 != null){
            double s1 = this.p1.distance(p2);
            double s2 = this.p1.distance(p3);
            double s3 = this.p2.distance(p3);
            return ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1));
        } else{
          return false;
        }
    }

    /** Method checks if it is possible to build triangle using three provided points*/
    public boolean isValid(MyPoint p1, MyPoint p2, MyPoint p3){
        double s1 = p1.distance(p2);
        double s2 = p1.distance(p3);
        double s3 = p2.distance(p3);
        return ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1));
    }

    /** Method checks if it is possible to build triangle using three provided points*/
    public boolean isValid(double x1, double y1, double x2, double y2, double x3, double y3){
        MyPoint p1 = new MyPoint(x1,y1);
        MyPoint p2 = new MyPoint(x2,y2);
        MyPoint p3 = new MyPoint(x3,y3);
        double s1 = p1.distance(p2);
        double s2 = p1.distance(p3);
        double s3 = p2.distance(p3);
        return ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1));
    }

    // constructor that creates triangle with specified points
    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3){
        if (isValid(p1, p2, p3)) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    /** Method that returns the area of the triangle. */
    public double getArea(){
        double side_1 = MyPoint.distance(this.p1, this.p2);
        double side_2 = MyPoint.distance(this.p1, this.p3);
        double side_3 = MyPoint.distance(this.p2, this.p3);
        double s = (side_1 + side_2 + side_3) / 2;
        double area = Math.sqrt(s*(s - side_1)*(s - side_2)*(s - side_3));
        return area;
    }

    /** Method that returns the area of the triangle. */
    public double getArea(MyPoint p1, MyPoint p2, MyPoint p3){
        double side_1 = p1.distance(p2);
        double side_2 = p1.distance(p3);
        double side_3 = p2.distance(p3);
        double s = (side_1 + side_2 + side_3) / 2;
        double area = Math.sqrt(s*(s - side_1)*(s - side_2)*(s - side_3));
        return area;
    }

    /** Method that returns the perimeter of the triangle. */
    public double getPerimeter(){
        return MyPoint.distance(this.p1, this.p2) + MyPoint.distance(this.p1, this.p3) + MyPoint.distance(this.p2, this.p3);
    }

    /** Method returns true if the specified point p is inside this triangle.
     * If area of 3 small triangles is the same as the big one then point is inside triangle.
     * (not sure if this approach is 100% correct) */
    public boolean contains(MyPoint p){
        // calculate area of p-p1-p2
        double area1 = getArea(p, this.p1, this.p2);
        // calculate area of p-p2-p3
        double area2 = getArea(p, this.p1, this.p3);
        // calculate area of p-p1-p3
        double area3 = getArea(p, this.p2, this.p3);
        // calculate area of p1-p2-p3
        double mainArea = this.getArea();
        // if area of 3 small triangles is equal to area of big one then true
        return (area1 + area2 + area3 == mainArea);
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
}
