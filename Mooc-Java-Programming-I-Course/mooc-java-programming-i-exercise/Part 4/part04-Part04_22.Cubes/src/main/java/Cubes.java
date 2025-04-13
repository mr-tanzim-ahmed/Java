
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String str= scanner.nextLine();
            if(str.equals("end")){
                break;
            }
            int num= Integer.valueOf(str);
            int cube= num*num*num;
            System.out.println(cube);
        }
    }
}
