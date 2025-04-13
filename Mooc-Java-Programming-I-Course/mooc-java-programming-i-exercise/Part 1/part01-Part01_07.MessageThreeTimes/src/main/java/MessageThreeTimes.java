import java.util.Scanner;
public class MessageThreeTimes {

    public  static void main(String ara[])
    {   
        Scanner read= new Scanner(System.in);
        System.out.println("Write a message:");
        
        String str= read.nextLine();
       for(int i=0;i<3;i++)
       {
        System.out.println(str);
       }

    }
}