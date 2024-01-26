import java.util.Scanner;

/**
 * TestTriangle has the user enter the length of three sides of
 * a triangle, the triangle color, and a boolean value to indicate
 * whether the triangle is filled. It then creates a Triangle object
 * using the input as the parameters
 * TestTriangle then displays the toString of the object as well as
 * the area, perimeter, and whether the triangle is filled.
 *
 * @author Isaac Warren
 */
public class TestTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Creates new Scanner Object

        // Prompt user to enter three sides of a Triangle
        System.out.print("Enter three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Prompt user to enter a color
        System.out.println("\nEnter a color: ");
        String color = input.next();

        // Prompt user to enter whether triangle is filled
        System.out.println("\nIs the triangle filled ('true' or 'false'? ");
        boolean filled = input.nextBoolean();

        // Create Triangle object myTriangle from user defined parameters
        Triangle myTriangle = new Triangle(side1, side2, side3);
        myTriangle.setColor(color);
        myTriangle.setFilled(filled);

        // Output myTriangle info
        System.out.println("\n\n");
        System.out.println(myTriangle.toString());
        System.out.println("Area: " + myTriangle.getArea());
        System.out.println("Perimeter: " + myTriangle.getPerimeter());
        System.out.println("Color: " + myTriangle.getColor());
        System.out.println("Triangle is " +
                (myTriangle.isFilled() ? "" : "not ")
                + "filled");
    }
}
