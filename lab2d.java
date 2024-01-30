

import java.util.Scanner;

public class lab2d {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("NAME : SUBHADIP DAS " + " ROLL : 2230210");
        System.out.print("Enter the x-coordinate of the point: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the y-coordinate of the point: ");
        double y = scanner.nextDouble();

    
        double radius = 5.0;
        double distanceSquared = x * x + y * y;

        if (distanceSquared < radius * radius) {
            System.out.println("The point (" + x + ", " + y + ") lies inside the circle.");
        } else if (distanceSquared > radius * radius) {
            System.out.println("The point (" + x + ", " + y + ") lies outside the circle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") lies on the circle.");
        }
    }
}
