public class StarSign {
    public static void main(String[] args) {
        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(3);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {

        String stars = "*";
        if (number <= 0) {
            // sanity check: don't print anything if the number is 0 or less
            return;
        }
        for (int i = 0; i < number; i++) {
            stars += "*";
        }

        System.out.println(stars);
    }

    public static void printSquare(int size) {

        if (size <= 0) {
            return;
        }

        // first line
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {

        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {

        for (int i = 0; i < size; i++) {
            printStars(i + 1);
        }
    }
}