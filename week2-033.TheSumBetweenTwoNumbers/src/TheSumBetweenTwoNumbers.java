
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine()) - 1;

        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());

        int sum=0;

        while (true) {
            if (last == first) {
                break;
            } else {
                sum = sum + last;
                last-=1;
            }
        }
        System.out.println("Sum is " + sum);

        System.out.println("The sum is " + sum);
    }
}
