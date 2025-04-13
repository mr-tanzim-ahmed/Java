
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String str = scanner.nextLine();
            if(str.length()==0){
                break;
            }
            String a[] = str.split(" ");
            int size = a.length;
            System.out.println(a[size-1]);
        }

    }
}