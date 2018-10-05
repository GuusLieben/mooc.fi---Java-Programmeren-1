
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int pow = Integer.parseInt(reader.nextLine());

        int sum = (int)Math.pow(2,pow+ 1 ) - 1;
        System.out.println("The result is " + sum);
    }
}
