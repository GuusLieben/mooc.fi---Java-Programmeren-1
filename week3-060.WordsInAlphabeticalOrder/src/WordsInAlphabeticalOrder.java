
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();

            if (!word.isEmpty()) {
                words.add(word);
            } else {
                Collections.sort(words);

                for (String out : words) {
                    System.out.println(out);
                }
                break;
            }
        }
    }
}
