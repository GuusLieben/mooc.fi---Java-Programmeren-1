public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        this.value += 1;

        if (!(this.value <= this.upperLimit)) {
            this.value = 0;
        }
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        String value = Integer.toString(this.value);
        if (this.value < 10) {
            value = "0" + value;
        }
        return value;
    }

    public void setValue(int set) {
        if (set >= 0 && set <= this.upperLimit) {
            this.value = set;
        }
    }
}
