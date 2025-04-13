
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String text = scanner.nextLine();
            if(text.length()==0){
                break;
            }
            String pices[]=text.split(" ");
            for(String word: pices){
            System.out.println(word);
            }
        }

    }
}
