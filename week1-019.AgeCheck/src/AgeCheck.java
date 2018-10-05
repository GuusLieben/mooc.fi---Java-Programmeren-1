
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Ask user to enter their age
        System.out.println("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());

        // Print OK or Impossible based on value
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
