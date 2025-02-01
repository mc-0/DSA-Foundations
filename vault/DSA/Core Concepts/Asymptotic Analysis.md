- **Theta - Θ** - Helps classify algorithms, describing the expected behavior of an algorithm for typical or average cases.

- **Omega - Ω** - Develops lower bounds & sets a minimum performance threshold that an algorithm must meet for all input.

- **Oh - O** - Develops upper bounds & provides a guarantee on the worst-case performance for all inputs.

# Independent vs. Dependent Factors
- Independent:
    - Algorithm Design
    - Input Data

- Dependent:
    - Hardware (CPU, Memory, etc.)
    - Software (Compiler, Interpreter, etc.)
    - System (OS, Network, etc.)

# Analyzing Algorithm Performance
The goal is to generalize by ignoring lower order terms, but be mindful of:
1. Cost & frequency of operations
2. Loops
3. Function calls / Recursive calls
4. if-else & switch statements
5. Data structures used & their operations
6. Input size


![bigO](https://github.com/user-attachments/assets/8f06a6e4-0b8d-4e3f-9eb4-00f848489334)

|          | Constant  | Logarithmic   | Linear | Linearithmic | Quadratic        | Cubic            | Exponential       |
|----------|-----------|---------------|--------|--------------|------------------|------------------|-------------------|
| Big-O:   | O(1)      | O(log(n))     | O(n)   | O(nlog(n))   | O(n<sup>2</sup>) | O(n<sup>3</sup>) | O(2<sup>n</sup>)  |
| Example: | Statement | Binary Search | Loop   | Merge Sort   | 2 Nested Loop    | 3 Nested Loops   | Exhaustive Search |
