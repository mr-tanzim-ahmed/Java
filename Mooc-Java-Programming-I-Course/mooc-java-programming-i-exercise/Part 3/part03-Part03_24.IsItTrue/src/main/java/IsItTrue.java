
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a string: ");
        String str = scanner.nextLine();
        if(str.equals("true")){
            System.out.println("You got right!");
        }else{
            System.out.println("Try again!");
        }
    }
}
