
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            list.add(num);
            if(num == 9999){
                break;
            }
        }
        int smallest = list.get(0);
        for(int i=0; i< list.size(); i++){
            if(smallest>list.get(i)){
                smallest = list.get(i);
            }
        }
        System.out.println("Smallest number: "+smallest);

        for(int  i=0;i<list.size();i++){
            if(smallest == list.get(i)){
                System.out.println(smallest+" is at index "+ i);
            }
        }

        
    }
}
