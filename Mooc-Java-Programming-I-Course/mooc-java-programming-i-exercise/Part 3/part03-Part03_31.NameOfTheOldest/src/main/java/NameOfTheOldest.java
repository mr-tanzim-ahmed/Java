
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int max= 0 ;
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String pices[]= text.split(",");
            String name= pices[0];
            int age= Integer.valueOf(pices[1]);
            if(age>max){
                max=age;
                oldestName= name;
            }
        }
        System.out.println("Name of the oldest: "+oldestName);


    }
}
