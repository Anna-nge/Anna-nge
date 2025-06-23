/* Name-Nang Nu Nu Aye
 * Id-6643005
 * Section-545
 */
package Worksheet_7;

public class TestTriangle {
    public static void main(String[] args) {
        // Creating a default triangle
        Triangle t1 = new Triangle();
        System.out.println("Default Triangle:");
        t1.displayTriangle();

        System.out.println("\nCustom Triangle:");
        // Creating a valid triangle
        Triangle t2 = new Triangle(3, 4, 5);
        t2.displayTriangle();

        System.out.println("\nInvalid Triangle Test:");
        // Creating an invalid triangle (should reset to default values)
        Triangle t3 = new Triangle(1, 2, 10);
        t3.displayTriangle();
    }
}