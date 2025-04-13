
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password?");
        String password = scan.nextLine();
        String unlock = "Caput Draconis";
        if(password.equals(unlock)){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
    }
}
