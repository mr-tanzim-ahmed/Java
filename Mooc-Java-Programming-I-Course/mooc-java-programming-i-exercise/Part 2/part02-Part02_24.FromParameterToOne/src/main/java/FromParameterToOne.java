import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num = Integer.valueOf(scan.nextLine());
        printFromNumberToOne(num);

    }
    public static void printFromNumberToOne(int num){
        for(int i = num; i>=1 ;i--){
            System.out.println(i);
        }
    }

}
