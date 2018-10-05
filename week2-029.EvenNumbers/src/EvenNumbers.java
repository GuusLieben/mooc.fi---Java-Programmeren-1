
public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
        int sum = 0;

        while (true) {
            if (sum == 100) {
                break;
            } else {
                sum = sum + 2;
                System.out.println(sum);
            }
        }
    }
}
