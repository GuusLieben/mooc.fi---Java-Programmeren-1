import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String w = reader.nextLine();

        System.out.println("Length of the last part: ");
        int l = Integer.parseInt(reader.nextLine());

        String lw = w.substring(w.length()-l, w.length());
        System.out.println("Result: " + lw);
    }
}
