

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);
    }

    public static int[] copy(int[] array) {
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }

        return copy;
    }

    public static int[] reverseCopy(int[] array) {
        int[] rev = new int[array.length];

        for (int i = array.length - 1,
             j = 0;
             i >= 0;
             i--, j++
                ) {
            rev[j] = array[i];
        }

        return rev;
    }
}
