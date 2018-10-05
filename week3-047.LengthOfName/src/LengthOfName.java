
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String text = reader.nextLine();

        // call your method from here
        int length = calculateCharacters(text);
        System.out.println("Length : " + length);
    }
    
    // do here the method
    public static int calculateCharacters(String text) {
        int length = text.length();
        return length;
    }
    
}
