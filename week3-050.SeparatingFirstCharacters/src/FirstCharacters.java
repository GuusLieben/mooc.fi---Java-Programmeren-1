import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();

        int i=0;

        if (name.length() >= 3) {
            while (i != 3) {
                System.out.println((i + 1) + ". character: " + name.charAt(i));
                i++;
            }
        } else {
            System.out.println("No.");
        }
    }
}
