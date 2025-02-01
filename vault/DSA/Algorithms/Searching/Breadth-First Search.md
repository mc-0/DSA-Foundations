![image](https://github.com/user-attachments/assets/4724f4a8-b582-4aea-b907-f02ef8cdd1bc)

# Overview
* `Breadth First Search` is a graph traversal algorithm that explores all nodes of at a given depth before moving on to the next level.
* Implemented using a queue to explore all neighbors at each level.
* BFS is a foundational algorithm in computer science with applications in networks & data processing. Other examples include:
   * Finding the shortest path in unweighted graphs
   * Detecting connected components in undirected graphs
   * Finding all nodes within a certain distance
   * Solving puzzles in a minimum number of moves

***
# Complexity
**Time Complexity: O(V+E)**

    Each vertex is visited once (O(V)).
    All edges are explored once (O(E)).

**Space Complexity: O(V)**

    Queue: In the worst case (for a densely connected graph or tree), the queue can hold up to O(V)O(V) vertices.
    Visited Set: Stores all V vertices in the worst case.
***


# Queue-based Approach
[Queue-based BFS Implementation]()

```
1. Initialize a collection (keep track of what nodes have been visited)
2. Initialize a queue
    - Add the 1st / root node to the queue & mark it as `visited`
3. While the queue is NOT empty:
    - Dequeue the next vertex / node
    - For each adjacent vertex / child node
      - Perform some processing of vertex / node as necessary
      - If the node / vertex has NOT been visited yet:
        - Add children / adjacent nodes to the queue
        - Mark the vertex / node as visited
```