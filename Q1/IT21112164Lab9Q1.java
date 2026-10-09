import java.util.Scanner;

public class IT21112164Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = input.nextDouble();

        System.out.print("Enter value b: ");
        double b = input.nextDouble();

        System.out.print("Enter value c: ");
        double c = input.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c;

        if (d >= 0 && a != 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            if (d > 0) {
                System.out.println("\nRoots are real and different :");
            } else {
                System.out.println("\nRoots are real and equal :");
            }

            System.out.printf("Root 1: %.2f%n", x1);
            System.out.printf("Root 2: %.2f%n", x2);
        } else {
            System.out.println("Roots are not real.");
        }

        input.close();
    }
}