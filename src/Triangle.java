/**
 * Triangle is a java class to describe a geometric triangle
 * It extends the GeometricObject class
 * Triangle has two constructors:
 * Triangle(), Triangle(double side1, double side2, double side3)
 *
 * @author Isaac Warren
 */
public class Triangle
        extends GeometricObject{

    private double side1;
    private double side2;
    private double side3;

    /**Default construct*/
    Triangle() {
        side1 = side2 = side3 = 1.0;
    }

    /** Construct a Triangle from user input sides*/
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /** Getter method for side1 */
    public double getSide1() {
        return side1;
    }

    /** Getter method for side2 */
    public double getSide2() {
        return side2;
    }

    /** Getter method for side3 */
    public double getSide3() {
        return side3;
    }

    /** Getter method for area. Overrides GeometricObject method */
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /** Getter method for perimeter. Overrides GeometricObject method */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /** Overrides toString. Returns a String describing Triangle */
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }

}
