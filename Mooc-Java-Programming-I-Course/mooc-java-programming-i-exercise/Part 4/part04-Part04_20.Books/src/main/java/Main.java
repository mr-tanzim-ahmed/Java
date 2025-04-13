import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> book= new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        while(true){
            System.out.print("Title: ");
            String title= scan.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages= Integer.valueOf(scan.nextLine());
            System.out.print("Publication year: ");

            int year= Integer.valueOf(scan.nextLine());
            book.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String ask= scan.nextLine();

        if(ask.equals("everything")){
            for(Book e:book){
                System.out.println(e);
            }
        }
        else  if(ask.equals("name")){
            for(Book e:book){
                System.out.println(e.getTitle());
            }
        }
        
    }
}
