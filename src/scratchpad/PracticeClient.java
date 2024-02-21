package scratchpad;

import patterns.greedyalgorithms.MinAddToMakeParenthesesValid;
import patterns.greedyalgorithms.RemoveDuplicateLetters;
import patterns.knapsackdp.KnapsackTopDownDPMemoization;

public class PracticeClient {

    public static void main(String[] args) {
        int[] w = {2,3,1,4};
        int[] v = {4,5,3,7};
        int c = 5;

        System.out.println(KnapsackTopDownDPMemoization.solveKnapsack(v,w,c));
    }



    }

