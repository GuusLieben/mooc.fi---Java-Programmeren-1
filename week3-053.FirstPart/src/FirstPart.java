
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String w = reader.nextLine();

        System.out.println("Length of the first part: ");
        int l = Integer.parseInt(reader.nextLine());

        String fw = w.substring(0,l);
        System.out.println("Result: " + fw);
    }
}
