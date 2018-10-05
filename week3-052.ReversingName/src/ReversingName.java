import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();

        int i=0;
        int l=name.length();

        while (i!=l) {
            System.out.print(name.charAt(l-i-1));
            i++;
        }
    }
}