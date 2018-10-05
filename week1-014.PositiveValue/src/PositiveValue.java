
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        // Ask user to enter a number
        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());

        // Print positive or not positive depending on value
        if (n > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
