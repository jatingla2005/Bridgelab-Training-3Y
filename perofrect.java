
// perimeter of a Rectangle
// Write a program to calculate the perimeter of a rectangle. Take the length
// and width as inputs and use the formula:
// Perimeter = 2 * (length + width).

public class perofrect {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle with length " + length + " and width " + width + " is: " + perimeter);
        scanner.close();
    }
    
}
