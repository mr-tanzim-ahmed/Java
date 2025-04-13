
import java.util.ArrayList;

public class RemoveLast {
    public static void removeLast(ArrayList<String>string){
        int len= string.size();
        if(len==0){
            return;
        }
        string.remove(len-1);
    }
    public static void main(String[] args) {
        ArrayList<String>strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);
        System.out.println(strings);
    }

}