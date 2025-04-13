import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    
    }


    public static int smallest(int array[]){
        int min= array[0];
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static int indexOfSmallest(int[] array){
        int i;
        int smallest = smallest(array);
        for(i=0;i<array.length;i++){
            if(array[i]==smallest){
                return i;
            }
        }
        return 0;
    }
    public static int indexOfSmallestFrom(int table[],  int startIndex){
        int smallestIndex = startIndex;
        for(int i=startIndex;i<table.length;i++){
            if(table[i]<table[smallestIndex]){
                smallestIndex = i;
            }
        } 
        return smallestIndex;
    }
    public static void swap(int array[], int index1, int index2){
        int temp= array[index1];
        array[index1]=array[index2];
        array[index2]= temp;
    }
    public static void sort(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(Arrays.toString(array));
            int smallestIndex =indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }

}
