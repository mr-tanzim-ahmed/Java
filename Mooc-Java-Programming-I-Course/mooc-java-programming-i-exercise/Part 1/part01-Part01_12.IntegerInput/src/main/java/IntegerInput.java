
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(input.nextLine());
        System.out.println("You gave the number "+num);

    }
}
