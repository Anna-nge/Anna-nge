/* Name-Nang Nu Nu Aye
 * Id-6643005
 * Section-545
 */
package Worksheet_7;

public class Triangle extends GeometricObject {
    private double side1, side2, side3;

    // Default constructor (sets sides to 1.0)
    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    // Constructor with three side lengths
    public Triangle(double s1, double s2, double s3) {
        if (isValidTriangle(s1, s2, s3)) {
            side1 = s1;
            side2 = s2;
            side3 = s3;
        } else {
            System.out.println("Invalid triangle sides! Setting default values.");
            side1 = 1.0;
            side2 = 1.0;
            side3 = 1.0;
        }
    }

    // Method to calculate the area using Heron's formula
    public double getArea() {
        double s = (side1 + side2 + side3) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate the perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Method to display triangle details
    public void displayTriangle() {
        System.out.println("Triangle sides: " + side1 + ", " + side2 + ", " + side3);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    // Checks if given sides form a valid triangle
    private boolean isValidTriangle(double s1, double s2, double s3) {
        return (s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1);
    }
}