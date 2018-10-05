
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true) {

            System.out.println("Type the password: ");
            String passcheck = reader.nextLine();

            if (passcheck.equals(password)) {
                System.out.println("Right!\nThe secret is: jryy qbar!"); //Bonus : secret is "well done!" Rot13
                break;
            } else {
                System.out.println("Wrong!");
            }

        }
    }
}
