
public class FromOneToHundred {

    public static void main(String[] args) {
        // Write your program here
        int sum = 0;
        while (true) {
            if (sum == 100) {
                break;
            } else {
            sum = sum + 1;
                System.out.println(sum);
            }
        }
    }
}
