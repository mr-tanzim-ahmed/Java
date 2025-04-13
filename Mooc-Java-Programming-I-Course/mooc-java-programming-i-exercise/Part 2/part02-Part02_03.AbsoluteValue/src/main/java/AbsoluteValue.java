import java.util.Scanner;
public class AbsoluteValue{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = Integer.valueOf(read.nextLine());
        
        if (number > 0) {
            System.out.println(number);
        }  else {
            System.out.println(number*(-1));
        }
    }
}