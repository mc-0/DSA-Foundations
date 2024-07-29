package scratchpad;

import blind75.arrays_and_hashing.ValidSudoku;
import blind75.slidingwindow.BuyAndSellStock;

public class PracticeClient {

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        BuyAndSellStock buyAndSellStock = new BuyAndSellStock();
        System.out.println(buyAndSellStock.maxProfit(prices));
    }
}
