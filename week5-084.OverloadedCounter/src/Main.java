public class Main {

    public int val;

    public static void main(String[] args) {

    }

    // Start
    public Counter(int startingValue, boolean check) {
        if (check) {
            this.val = startingValue;
        }
    }

    // Start with no-check
    public Counter(int startingValue) {
       this.val = startingValue;
    }

    // Start with c0
    public Counter(boolean check) {
        if (check) {
            this.val=0;
        }
    }

    // Start with c0 and no-check
    public Counter() {
        this.val=0;
    }

    // Always increase by 1
    public void increase() {
        this.val++;
    }

    // Only decrease by 1 if !val<0
    public void decrease() {
        if (Check(this.val)) {
            this.val--;
        }
    }

    // Always increase by in
    public void increase(int in) {
        this.val += in;
    }

    // Only decrease by in if !val<0
    public void decrease(int in) {
        if (Check(this.val)) { this.val -= in; }
        if (this.val<0) { this.val=0; }
    }

    public boolean Check(int n) {
        if (n < 0) { return false; }
        return true;
    }
}
