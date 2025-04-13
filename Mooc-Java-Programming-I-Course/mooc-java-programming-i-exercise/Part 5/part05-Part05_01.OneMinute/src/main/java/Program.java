import java.util.Scanner;
import java.time.Clock;
public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer time = new Timer();
        while (true) {
            System.out.println(time);
            time.advance();
            try{
                Thread.sleep(10);
            }catch(Exception e){
                System.out.println("Error! "+e.getMessage());
            }
        }

    }
}
