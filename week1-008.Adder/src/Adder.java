
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Type a number: ");
        int n1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int n2 = Integer.parseInt(reader.nextLine());
        int n3 = n1 + n2;
        System.out.println("Sum of the numbers: " + n3);
    }
}
