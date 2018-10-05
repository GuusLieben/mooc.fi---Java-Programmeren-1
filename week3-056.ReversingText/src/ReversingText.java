
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int i=0;
        int l=text.length();
        String reverse="";

        while (i!=l) {
            reverse = reverse + text.charAt(l-i-1);
            i++;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}