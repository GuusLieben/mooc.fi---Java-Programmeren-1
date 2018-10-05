import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();

        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        int i=0;

        // 7 iterations
        while (i<7) {

            // Random number between 1-39
            int c = random.nextInt(40);

            // Ignore the number if it's already in the array, or if it's zero
            if (!(containsNumber(c) || (c == 0))) {
                numbers.add(c);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test if the number is already in the drawn numbers
        if (numbers.contains(number)) {
            return true;
        } else {
            return false;
        }

    }
}
