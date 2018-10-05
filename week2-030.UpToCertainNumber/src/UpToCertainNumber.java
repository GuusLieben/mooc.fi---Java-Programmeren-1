
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number? ");
        int sum = Integer.parseInt(reader.nextLine());
        int count = 0;
        while (true) {
            if (count == sum) {
                break;
            } else {
                count = count + 1;
                System.out.println(count);
            }
        }
    }
}
