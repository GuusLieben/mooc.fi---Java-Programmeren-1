public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        String stars = "";
        int i=0;
        while (i < amount) {
            stars += "*";
            i++;
        }
        System.out.println(stars);
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i=0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i=1;
        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }

    }

    public static void xmasTree(int height) {
        // 40.3
        int i=1;
        while (i <= height) {
            printWhitespaces(height - i);
            printStars(i + (i - 1));
            i++;
        }

        i=2; int n=0;
        while (n < i) {
            printWhitespaces(height - 2);
            printStars(3);
            n++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, you can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(758675567);
    }
}
