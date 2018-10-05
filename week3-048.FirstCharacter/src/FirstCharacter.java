import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();

        System.out.println("First character: " + firstCharacter(text));
    }

    public static char firstCharacter(String text) {
        char n = text.charAt(0);
        return n;
    }
}
