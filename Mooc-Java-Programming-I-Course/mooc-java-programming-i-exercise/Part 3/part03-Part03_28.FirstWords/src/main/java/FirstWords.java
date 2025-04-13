import java.util.Scanner;
public class FirstWords{
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        while(true){
            String text= input.nextLine();
            if(text.length()==0){
                break;
            }
            String word[]= text.split(" ");
                System.out.println(word[0]);
            
        }
    }
}