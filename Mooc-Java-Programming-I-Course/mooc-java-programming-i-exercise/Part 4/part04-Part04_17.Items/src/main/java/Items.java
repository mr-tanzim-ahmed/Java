
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item
        
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String str= scanner.nextLine();
            if(str.isEmpty()){
                break;
            }
            Item a= new Item(str);
            items.add(a);

        }
        for(Item e:items){
            System.out.println(e);
        }

    }
}
