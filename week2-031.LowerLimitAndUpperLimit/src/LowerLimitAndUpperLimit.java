
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());

        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());

        while (true) {
            if (first > last) {
                break;
            } else {
                if ((first - 1) == last) {
                    break;
                } else {
                    System.out.println(first);
                    first = first + 1;
                }
            }

        }
    }
}
