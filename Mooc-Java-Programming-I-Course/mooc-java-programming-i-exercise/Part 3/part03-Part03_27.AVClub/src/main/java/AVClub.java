
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String str = scanner.nextLine();
            if(str.length()==0){
                break;
            }
            String pices[] =str.split(" ");
            for(String word: pices){
                if(word.contains("av")){
                    System.out.println(word);
                }
                
            } 
        }

    }
}
