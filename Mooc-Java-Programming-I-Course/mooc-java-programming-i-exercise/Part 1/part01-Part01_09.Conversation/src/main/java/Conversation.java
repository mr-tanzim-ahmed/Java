
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Greetings! How are you doing?");
        String talk1= read.nextLine();
        
        System.out.println("Oh, how interesting. Tell me more!");
        String talk2= read.nextLine();

        System.out.println("Thanks for sharing!");

    }
}
