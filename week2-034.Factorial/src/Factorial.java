import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int i,fact=1;

        for ( i=1; i<=n; i++ ) {
            fact=fact*i;
        }

        System.out.println("Factorial is " + fact);
    }
}
