package main.patterns.dynamicprogramming.knapsackdp;

// Time and space complexity of O(N*C), where ‘N’ represents total items, and ‘C’ is the maximum capacity.
public class KnapsackBottomUpDP {

    public int solveKnapsack(int[] profits, int[] weights, int capacity) {
        // basic checks
        if (capacity <= 0 || profits.length == 0 || weights.length != profits.length)
            return 0;

        int n = profits.length;
        int[][] dp = new int[n][capacity + 1];

        // populate the capacity=0 columns, with '0' capacity we have '0' profit
        for(int i=0; i < n; i++)
            dp[i][0] = 0;

        // if we have only one weight, we will take it if it is not more than the capacity
        for(int c=0; c <= capacity; c++) {
            if(weights[0] <= c)
                dp[0][c] = profits[0];
        }

        // process all sub-arrays for all the capacities
        for(int i=1; i < n; i++) {
            for(int c=1; c <= capacity; c++) {
                int profit1= 0, profit2 = 0;
                // include the item, if it is not more than the capacity
                if(weights[i] <= c)
                    profit1 = profits[i] + dp[i-1][c-weights[i]];
                // exclude the item
                profit2 = dp[i-1][c];
                // take maximum
                dp[i][c] = Math.max(profit1, profit2);
            }
        }

        // maximum profit will be at the bottom-right corner.
        return dp[n-1][capacity];
    }

}
