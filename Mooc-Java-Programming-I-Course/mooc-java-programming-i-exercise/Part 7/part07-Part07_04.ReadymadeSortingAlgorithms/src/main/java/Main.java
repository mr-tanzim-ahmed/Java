import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        System.out.println(Arrays.toString(array));

        String[] strings = {"D","B","C"};
        sort(strings);
        System.out.println(Arrays.toString(strings));

        ArrayList<Integer> integer = new ArrayList<>();
        ArrayList<String> string = new ArrayList<>();

        Collections.addAll(integer, 3, 1, 5, 99, 3, 12);
        Collections.addAll(string, "D","B","C");

        System.out.println(integer);
        System.out.println(string);
       
    }
    public static void  sort(int[] array){
        Arrays.sort(array);
    }
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    public static void sortIntegers(ArrayList<Integer>integers){
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String>strings){
        Collections.sort(strings);
    }
}
