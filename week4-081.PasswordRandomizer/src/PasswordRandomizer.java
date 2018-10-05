import java.util.Random;

public class PasswordRandomizer {
    // Define the variables

    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pass = "";
        for (int i = 0; i < this.length; i++) {
            Random random = new Random();
            int n = random.nextInt(26);
            char s = "abcdefghijklmnopqrstuvwxyz".charAt(n);
            pass += s;
        }
        return pass;
    }
}
