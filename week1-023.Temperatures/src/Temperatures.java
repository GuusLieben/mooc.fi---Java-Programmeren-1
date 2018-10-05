
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {

            System.out.println("Enter a number to add to the graph: ");
            int value = Integer.parseInt(reader.nextLine());

            // Check if value is within the range [-30 : 40]
            if (!(value < -30 || value > 40)) {
                Graph.addNumber(value);
            } else {
                System.out.println("Value out of range. Not added to graph.");
            }

        }
    }
}