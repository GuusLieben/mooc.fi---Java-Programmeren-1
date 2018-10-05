
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers += 1;
        this.sum += number;
    }

    public int amountOfNumbers() {
        // code here
        return (this.amountOfNumbers);
    }

    public int sum() {
        // code here
        return this.sum;
    }

    public double average() {
        // code here
        double avg = 0;
        if (!(amountOfNumbers == 0)) {
            avg = (double) sum / (double) amountOfNumbers;
        }
        return avg;
    }
}
