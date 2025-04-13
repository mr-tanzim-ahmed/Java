import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int num = Integer.valueOf(scan.nextLine());
        double tax=0;

        if(num < 5000){
            System.out.println("No tax!");
        }else if(num<=25000){
            tax = 100 + (num-5000)*0.08;
        } else if(num<=55000){
            tax = 1700 + (num-25000)*0.10;
        }else if(num<=200000){
            tax = 4700 + (num-55000)*0.12;
        }else if(num<=1000000){
            tax = 22100+ (num-200000)*0.15;
        }else if(num>1000000){
            tax = 142100+ (num-1000000)*0.17;
        }
        System.out.println("Tax: "+tax);
    }
}
