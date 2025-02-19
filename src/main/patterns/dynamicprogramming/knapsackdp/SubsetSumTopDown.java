package main.patterns.dynamicprogramming.knapsackdp;
// Time: O(N*S)
// Space: O(N*S)
public class SubsetSumTopDown {

    public boolean canPartition(int[] num, int sum) {
        int n = num.length;
        boolean[][] dp = new boolean[n][sum + 1];

        // populate the sum=0 columns, as we can always form '0' sum with an empty set
        for (int i = 0; i < n; i++)
            dp[i][0] = true;

        // with only one number, we can form a subset only when the required sum is
        // equal to its value
        for (int s = 1; s <= sum; s++) {
            dp[0][s] = (num[0] == s ? true : false);
        }

        // process all subsets for all sums
        for (int i = 1; i < num.length; i++) {
            for (int s = 1; s <= sum; s++) {
                // if we can get the sum 's' without the number at index 'i'
                if (dp[i - 1][s]) {
                    dp[i][s] = dp[i - 1][s];
                } else if (s >= num[i]) {
                    // else include the number and see if we can find a subset to get the remaining
                    // sum
                    dp[i][s] = dp[i - 1][s - num[i]];
                }
            }
        }

        // the bottom-right corner will have our answer.
        return dp[num.length - 1][sum];
    }

}
