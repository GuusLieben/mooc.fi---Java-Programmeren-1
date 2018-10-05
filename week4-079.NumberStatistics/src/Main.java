import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
        while (true) {

            int n = Integer.parseInt(reader.nextLine());

            if (n == -1) {
                break;

            } else {

                stats.addNumber(n);


                if (n%2 == 0) {
                    even.addNumber(n);

                } else {
                    odd.addNumber(n);

                }
            }
        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }
}

