public class AdvancedAstrology {

    public static void printSpaces(int number) {
        String spaces = "";
        for (int i = 0; i < number; i++) {
            spaces += " ";
        }

        System.out.print(spaces);
    }
    public static void printStars(int number) {

        String stars = "";
        if (number <= 0) {
            // sanity check: don't print anything if the number is 0 or less
            return;
        }

        for (int i = 0; i < number; i++) {
            stars += "*";
        }

        System.out.println(stars);
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 0; i < size; i++) {
            printSpaces(size - i -1);
            printStars(i+1);
        }
    }
    public static void christmasTree(int height) {

        // "leaves" / triangle part
        for (int i = 0; i < height; i++) {
            printSpaces(height - i - 1);
            printStars(2*i + 1);
        }

        // base: 2 x 3 rectangle
        for (int i = 0; i <= 1; i++) {
            printSpaces(height - 2);
            printStars(3);
        }

    }

    public static void main(String[] args) {

        printTriangle(5);
        System.out.println("---");
        christmasTree(10);
        System.out.println("---");
        christmasTree(10);
    }
}