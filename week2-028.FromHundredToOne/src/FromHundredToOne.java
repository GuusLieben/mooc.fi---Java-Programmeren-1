
public class FromHundredToOne {

    public static void main(String[] args) {
        // Write your program here
        int sum = 101;

        while (true) {
            if (sum == 1) {
                break;
            } else {
                sum = sum - 1;
                System.out.println(sum);
            }
        }
    }
}
