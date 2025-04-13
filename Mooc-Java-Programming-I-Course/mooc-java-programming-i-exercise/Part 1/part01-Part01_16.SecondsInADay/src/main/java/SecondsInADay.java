
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = scanner.nextInt();
        int sec = days* (60*60*24);
        System.out.println(sec);
    }
}
