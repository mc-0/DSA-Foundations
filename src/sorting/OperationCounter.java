package sorting;

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
}
