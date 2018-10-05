
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        // Ask user for two numbers
        System.out.println("Type a number: ");
        int n1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number: ");
        int n2 = Integer.parseInt(reader.nextLine());

        // Use math. function to get biggest number
        int n3 = Math.max(n1, n2);

        // Print bigger number
        System.out.println("The bigger number of the two numbers given was: " + n3);
    }
}
