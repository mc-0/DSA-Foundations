**Dynamic Programming (DP)** is a strategy used to solve overlapping sub-problems. It differs from *divide & conquer* problems as they do not overlap.

#### When to use DP?
Dynamic programming is best applied in situations where a problem can be broken down into smaller "overlapping" sub-problems, where the outcome or calculation from one step can be fed into another or saved and then reused. These smaller problems can build into an optimal solution.

Identifying when to use DP can be challenging, but there exists a few key characteristics that suggest it is appropriate to apply the technique to a problem:

1. **The problem asks for an optimum / minimum value**, the min / max result, or the number of ways there is to do some thing. *Note:* This characteristic alone isn't sufficient alone to say the problem should be solved with DP.
2. **Future decisions depend on earlier ones**. Start by assuming DP is NOT an applicable and then try to find a counter example of the problem you're solving proving that a greedy algorithm doesn't work. If you know an earlier decision affects future decisions, then DP is applicable.
3. **Parallelization** - divide & conquer problems are easier to parallelize as their steps are independent whereas DP problems are much more difficult.

#### Tabulation (Bottom-Up Approach)
- Implemented with iteration
- usually a faster run time as it doesn't have the overhead associated with recursion

#### Memoization (Top-Down Approach)
* Implemented with recursion
* Easier to write as the order of the problems don't matter