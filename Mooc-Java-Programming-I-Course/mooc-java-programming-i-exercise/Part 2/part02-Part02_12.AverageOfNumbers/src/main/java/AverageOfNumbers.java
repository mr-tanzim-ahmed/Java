
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum=0;
        int amount = 0;

        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num==0){
                break;
            }
            amount++;
            sum = sum+ num;
        }  
        double avg = sum/amount;
        System.out.println("Average of the numbers: "+avg);

    }
}
