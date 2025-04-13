
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item>items= new ArrayList<>();
        Scanner scan= new Scanner(System.in);

        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier= scan.nextLine();
            if(identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name= scan.nextLine();
            if(name.isEmpty()){
                break;
            }
            Item newItem = new Item(identifier, name);
            if(!items.contains(newItem)){
                items.add(newItem);
            }

            
        }
        System.out.println("==Items==");
            for(Item i:items){
                System.out.println(i);
        }

    }
}
