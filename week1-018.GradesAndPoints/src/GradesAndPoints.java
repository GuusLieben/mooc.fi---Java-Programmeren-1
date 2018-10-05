
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Ask users to enter amount of points
        System.out.println("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());

        // Throw incorrect number if amount is too high/low
        if (points < 0 || points > 60) {
            System.out.println("Point amount out of correct range.");
        } else {

            // Check if points is equal to or greater than 0, AND smaller than 30
            if (points >= 0 && points < 30) {
                String grade = "failed";
                System.out.println("Grade: " + grade);
            }

            // Check if points is equal to or greater than 30, AND smaller than 35
            else if (points >= 30 && points < 35) {
                int grade = 1;
                System.out.println("Grade: " + grade);
            }

            // Check if points is equal to or greater than 35, AND smaller than 40
            else if (points >= 35 && points < 40) {
                int grade = 2;
                System.out.println("Grade: " + grade);
            }

            // Check if points is equal to or greater than 40, AND smaller than 45
            else if (points >= 40 && points < 45) {
                int grade = 3;
                System.out.println("Grade: " + grade);
            }

            // Check if points is equal to or greater than 45, AND smaller than 50
            else if (points >= 45 && points < 50) {
                int grade = 4;
                System.out.println("Grade: " + grade);
            }

            // Check if points is equal to or greater than 50, AND equal to or smaller than 60
            else if (points >= 50 && points <= 60) {
                int grade = 5;
                System.out.println("Grade: " + grade);
            }
        }
    }
}

// There has to be a better way to use System.out.println than calling it on every if statement, but let's not cheat with StackOverflow just yet.