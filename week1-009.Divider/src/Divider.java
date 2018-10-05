
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.

        // Ask user for n1
        System.out.println("Type a number: ");
        int n1 = Integer.parseInt(reader.nextLine());

        // Ask user for n2
        System.out.println("Type another number: ");
        int n2 = Integer.parseInt(reader.nextLine());

        // Output division result
        double n3 = 1.0 * n1 / n2;
        System.out.println("Division: " + n1 + " / " + n2 + " = " + n3);
    }
}
