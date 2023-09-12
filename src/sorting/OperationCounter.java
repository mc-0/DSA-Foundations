package sorting;

import static sorting.SortingClient.ANSI_RED;

public class OperationCounter {

    private int numSwaps;

    OperationCounter() {
        this.numSwaps = 0;
    }

    public void incrementOperation() {
        numSwaps++;
    }

    public void printOperations() {
        System.out.println("Swaps: " + numSwaps);
    }

    public void displayCurrentOperation(int[] arr, int a, int b) {
        System.out.println("SWAPPING: " + ANSI_RED + arr[a] + " || " + arr[b] );
    }
}
