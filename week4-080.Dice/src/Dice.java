import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int roll() {
        int roll = random.nextInt(this.numberOfSides + 1);
        if (roll == 0) {
            roll +=1;
        }
        return roll;
    }
}
