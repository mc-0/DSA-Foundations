package patterns.knapsackdp;

// Time: O(2^n)
// Space: O(n)
// This approach leads to overlapping sub-problems that are re-solved. Memoization can help solve the problem once
public class KnapsackBasic {

    public int solveKnapsack(int[] values, int[] weights, int capacity) {
        return this.knapsackRecursive(values, weights, capacity, 0);
    }

    private int knapsackRecursive(int[] values, int[] weights, int capacity, int currentIndex) {
        // base checks
        if (capacity <= 0 || currentIndex >= values.length)
            return 0;

        // recursive call after choosing the element at the currentIndex
        // if the weight of the element at currentIndex exceeds the capacity, we shouldn't process this
        int profit1 = 0;
        if( weights[currentIndex] <= capacity )
            profit1 = values[currentIndex] + knapsackRecursive(values, weights,
                    capacity - weights[currentIndex], currentIndex + 1);

        // recursive call after excluding the element at the currentIndex
        int profit2 = knapsackRecursive(values, weights, capacity, currentIndex + 1);

        return Math.max(profit1, profit2);
    }

}
