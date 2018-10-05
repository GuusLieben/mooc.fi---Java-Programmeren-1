
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int read = Integer.parseInt(reader.nextLine());

        int count = 0;

        while (true) {
            if (read == 0) {
                break;
            } else {
                count = count + read;
                read = read - 1;
            }
        }
        System.out.println("Sum is " + count);
    }
}
