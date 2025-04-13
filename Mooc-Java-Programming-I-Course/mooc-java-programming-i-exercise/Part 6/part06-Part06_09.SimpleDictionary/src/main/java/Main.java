
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        SimpleDictionary book= new SimpleDictionary();
        book.add("add","pike");
        Scanner scan= new Scanner(System.in);
        TextUI text = new TextUI(scan, book);
        text.start();
        System.out.println(book.translate("pike"));
    }
}
