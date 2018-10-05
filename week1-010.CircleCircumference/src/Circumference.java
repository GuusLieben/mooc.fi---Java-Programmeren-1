
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        // Ask user to enter radius
        System.out.println("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());

        // Calculate pi
        double pi = Math.PI;

        // Calculate circumference using pi
        double ci = 2 * pi * radius;

        // Print results
        System.out.println("Circumference of the circle: " + ci);
    }
}
