
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points[0-100]:");
        int num = Integer.valueOf(scan.nextLine());
        String grade;

        if(num < 0){
            grade= "impossible";
        }else if(num<=49){
            grade = "failed";
        } else if(num<=59){
            grade = "1";
        }else if(num<=69){
            grade = "2";
        }else if(num<=79){
            grade = "3";
        }else if(num<=89){
            grade = "4";
        }else if(num<=100){
            grade = "5";
        }else{
            grade = "incredible!";
        }
        System.out.println("Grade: "+grade);
    }
}
