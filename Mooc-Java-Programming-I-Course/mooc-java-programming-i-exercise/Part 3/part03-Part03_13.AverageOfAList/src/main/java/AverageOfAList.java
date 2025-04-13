
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if(input== -1){
                break;
            }
            list.add(input);
        }
        int sum=0;
        int num = list.size();
        for(int i=0;i<num;i++){
            sum += list.get(i);
        }
        double avg = (double)sum/num;
        System.out.println("Average: "+avg);
        
    }
}
