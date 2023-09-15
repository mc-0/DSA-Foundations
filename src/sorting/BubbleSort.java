package sorting;

import sorting.util.Swapper;

public class BubbleSort {


    // Runtime: O(n^2) Quadratic || Space: O(1) || Stable
    public static void sort(int [] collection){
        int n = collection.length;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if (collection[j - 1] > collection[j]) {
                    Swapper.swap(collection, j-1, j);
                }
            }

        }
    }

}
