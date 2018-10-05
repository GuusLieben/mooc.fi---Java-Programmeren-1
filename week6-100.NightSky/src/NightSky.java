import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    // Constructor 1
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    // Constructor 2
    public NightSky(double density) {
        this(density, 20, 10);
    }

    // Constructor 3
    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public void printLine() {
        Random random = new Random();

        for (int i = 0; i < width; i++) { // Don't go past the maximum width
            if (random.nextDouble() < density) { // Random number has to be smaller than the density
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }

        System.out.println();  // New line
    }

    public void print() {
        // Reset counter for each call
        starsInLastPrint = 0;

        for (int i = 0; i < height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}
