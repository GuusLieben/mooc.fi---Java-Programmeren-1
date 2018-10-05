
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Check :
        // (1) If a year is divisible by 4
        // (2) If a year is divisible by 100
        // (3) If a year is divisible by 400
        // (4) All other cases, false

        // Ask a user to enter a year
        System.out.println("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());

        // Check if all conditions match
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
