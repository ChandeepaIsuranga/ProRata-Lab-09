import java.util.Scanner;

public class IT21112164Lab9Q2 {

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        System.out.println("The area of the circle with radius " + radius
                + " is : " + circleArea(radius));

        input.close();
    }
}