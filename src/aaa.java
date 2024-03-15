import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values of g, f, and c in the equation (x^2 + y^2 + 2gx + 2fy + c = 0):");
        System.out.print("g: ");
        double g = scanner.nextDouble();
        System.out.print("f: ");
        double f = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        double radius = calculateRadius(g, f, c);

        if (radius > 0) {
            System.out.println("The radius of the circle is: " + radius);
        } else {
            System.out.println("Invalid input. The condition (g^2 + f^2 - c > 0) is not satisfied.");
        }
    }

    public static double calculateRadius(double g, double f, double c) {
        double discriminant = Math.pow(g, 2) + Math.pow(f, 2) - c;

        if (discriminant > 0) {
            return Math.sqrt(discriminant);
        } else {
            return -1; // Indicates invalid input
        }
    }
}
