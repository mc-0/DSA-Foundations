package main.patterns.twopointers;

// 121. Best Time To Buy & Sell Stock
public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1;
        int profit = 0;

        while (right < prices.length) {
            int gain;
            // check if current gain is profitable
            if (prices[left] < prices[right]) {
                gain = prices[right] - prices[left];
                profit = Math.max(profit, gain);
            }
            else {
                // the transaction isn't profitable, meaning a lower price is found at the right pointer index
                left = right;
            }
            right++;
        }
        return profit;
    }
}
