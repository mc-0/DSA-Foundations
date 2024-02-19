package patterns.greedyalgorithms;
// Time: O(n)
// Space: O(1)
public class MinAddToMakeParenthesesValid {

    public static int minAddToMakeValid(String S) {
        int balance = 0, additions = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                balance++;
            }
            else if (c == ')') {
                balance--;
            }

            if (balance < 0) {
                additions++;
                balance = 0;
            }
        }
        return additions + Math.abs(balance);
    }

}
