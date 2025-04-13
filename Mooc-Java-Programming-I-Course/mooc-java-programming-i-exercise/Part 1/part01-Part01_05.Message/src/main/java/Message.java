import java.util.Scanner;
public class Message {

    public  static void main(String args[])
    {
        Scanner read=new Scanner(System.in);
        System.out.println("Write a message: ");

        String str= read.nextLine();
        System.out.println(str);
    }
}