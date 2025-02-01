![image](https://github.com/user-attachments/assets/060e1ca7-32e0-4fa0-96e6-a62625b76d32)

# Overview
* `Depth First Search` is a fundamental graph traversal algorithm which is used to explore all nodes of a graph or tree.
* Explores as deeply as possible down one branch before backtracking & moving to the next branch.
* Implemented using a [[Stacks|stack]] (either explicitly or implicitly using recursion).
* Serves as the foundation for many algorithms with applications such as:
   * Detecting cycles in a graph
   * Topological sorting
   * Finding connected components

# Complexity
***
**Time Complexity: O(V+E)** where V is the number of vertices and E is the number of edges.

**Space Complexity: O(V)** for the recursion stack or explicit stack and visited set.
***

# General Recursive Approach
[Recursive DFS Implementation]()
```
1. Start at the root node (or any arbitrary node if the graph is not rooted).
   - Visit the node:
      - Mark the current node as "visited."
      - Perform any operation on the node (such as printing or storing the node value, if needed).

2. Explore neighbors:
   - For each adjacent (un-visited) node, recursively perform DFS on that node.
   - If the neighbor has not been visited, apply DFS to it.

3. Backtrack:
   - After exploring all neighbors of a node, backtrack to the previous node in the path.
   - Repeat the process for the next un-visited neighbor.

4. Terminate:
   - The algorithm terminates when all nodes have been visited, or all reachable nodes have been explored.
```



# Stack-Based Approach
[Stack-based DFS Implementation]()
```
1. Initialize a stack and push the starting node onto it.
2. While the stack is not empty:
    - Pop the top node from the stack.
     - If the node has not been visited:
        - Mark it as visited.
        - Push all its un-visited neighbors onto the stack.

    - Repeat until the stack is empty.
```