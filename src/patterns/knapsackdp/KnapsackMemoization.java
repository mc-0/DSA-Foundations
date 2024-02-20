package patterns.knapsackdp;

/*Since our memoization array dp[profits.length][capacity+1] stores the results for all subproblems,
we can conclude that we will not have more than NC subproblems
(where ‘N’ is the number of items and ‘C’ is the knapsack capacity). This means that our time complexity will be O(NC).
The above algorithm will use O(NC) space for the memoization array. Other than that, we will use O(N) space for the
recursion call-stack. So the total space complexity will be O(NC + N), which is asymptotically equivalent to O(N*C).*/

public class KnapsackMemoization {

    public int solveKnapsack(int[] profits, int[] weights, int capacity) {
        Integer[][] dp = new Integer[profits.length][capacity + 1];
        return this.knapsackRecursive(dp, profits, weights, capacity, 0);
    }

    private int knapsackRecursive(Integer[][] dp, int[] profits, int[] weights, int capacity,
                                  int currentIndex) {

        // base checks
        if (capacity <= 0 || currentIndex >= profits.length)
            return 0;

        // if we have already solved a similar problem, return the result from memory
        if(dp[currentIndex][capacity] != null)
            return dp[currentIndex][capacity];

        // recursive call after choosing the element at the currentIndex
        // if the weight of the element at currentIndex exceeds the capacity, we shouldn't process this
        int profit1 = 0;
        if( weights[currentIndex] <= capacity )
            profit1 = profits[currentIndex] + knapsackRecursive(dp, profits, weights,
                    capacity - weights[currentIndex], currentIndex + 1);

        // recursive call after excluding the element at the currentIndex
        int profit2 = knapsackRecursive(dp, profits, weights, capacity, currentIndex + 1);

        dp[currentIndex][capacity] = Math.max(profit1, profit2);
        return dp[currentIndex][capacity];
    }

}
