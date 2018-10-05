
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here
        // Ask the user to enter a number
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        // Check if number is odd, 1=true, 0=false
        int odd = (number % 2);

        // Print odd/even based on 1/0
        if (odd == 1) {
            System.out.println("Number " + number + " is odd.");
        } else if  (odd == -1) {
            System.out.println("Number " + number + " is odd.");
        } else {
            System.out.println("Number " + number + " is even.");
        }
    }
}
