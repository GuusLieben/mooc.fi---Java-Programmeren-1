import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Ask user to enter two numbers
        System.out.println("Type the first number: ");
        int n1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type the second number: ");
        int n2 = Integer.parseInt(reader.nextLine());

        // Print greater number, or equal
        if (n1 > n2 || n1 < n2) {
            System.out.println("Greater number: " + Math.max(n1,n2));
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
