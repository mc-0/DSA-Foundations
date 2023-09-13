package sorting;

import sorting.util.Swapper;

public class BubbleSort {

    private int[] collection;
    private boolean sorted;

    public BubbleSort(int[] collection){
        this.collection = collection;
        this.sorted = false;
    }

    // Runtime: O(n^2) Quadratic || Space: O(1) || Stable
    public void sort(){
        int n = collection.length;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if (collection[j - 1] > collection[j]) {
                    Swapper.swap(collection, j-1, j);
                }
            }

        }
        this.sorted = true;
    }

    public void printList() {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < collection.length) {
            if (index % 20 == 0) {
                sb.append("\n");
            }
            sb.append(collection[index]).append(" ");
            index++;
        }
        System.out.println(sb);
    }

    public boolean isSorted() {
        return sorted;
    }

}
