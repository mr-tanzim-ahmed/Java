import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, i;
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        System.out.println("");

        System.out.print("Search for? ");
        int item = Integer.valueOf(scanner.nextLine());

        for( i=0;i<list.size();i++){
            if(item == list.get(i)){
                System.out.println(item+" is at index "+ i);
            }
        } 
        
    }
}