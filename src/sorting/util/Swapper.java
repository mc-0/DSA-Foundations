package sorting.util;

public class Swapper {

    public static void swap(int[] collection, int a, int b){
        int temp = collection[a];
        collection[a] = collection[b];
        collection[b] = temp;
    }

}
