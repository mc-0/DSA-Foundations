
![KofyW](https://github.com/user-attachments/assets/7591f5d8-3bf4-4bcb-98d2-85096ca5fa68)

# Overview

Prim's Algorithm is a **greedy algorithm** used to find the **Minimum Spanning Tree (MST)** of a connected, weighted, and undirected graph. It grows the MST starting from an arbitrary vertex and adds the smallest edge that connects a new vertex to the growing MST.

# Key Characteristics

- **Greedy Strategy**:
  - Selects the smallest edge that expands the current tree.
  
- **Priority Queue**:
  - A **min-heap** or **priority queue** is used to efficiently select the minimum-weight edge that connects a vertex inside the MST to a vertex outside.
  
- **Input Requirement**:
  - The graph must be **connected**.
  
- **Applications**:
  - Network design (e.g., telecommunications or cable networks).
  - Approximation algorithms in clustering and graph-related problems.

- **Efficiency**:
  - Prim’s algorithm is efficient for **dense graphs** or graphs where many vertices are connected by edges.
  
- **Comparison to Kruskal’s Algorithm**:
  - **Kruskal’s** algorithm sorts edges and then builds the MST. **Prim’s** algorithm grows the tree vertex by vertex.
  - **Prim’s** is more efficient for dense graphs, while **Kruskal’s** can be better for sparse graphs.
  
- **Use Cases**:
  - Best suited for **dense graphs** where there are many edges between vertices.

---

## General Pseudocode

```plaintext
primAlgorithm(graph, startVertex):
    result = []                    // List to store MST edges
    minHeap = priorityQueue()      // Min-heap to store edges (weight, vertex)
    visited = Set()                // To track visited vertices
    initializeKey(startVertex)     // Initialize key values for vertices

    add startVertex to minHeap with key 0

    while minHeap is not empty:
        u = extractMin(minHeap)    // Get the vertex with the smallest key
        visited.add(u)              // Mark the vertex as visited

        for each neighbor v of u:
            if v is not in visited:
                weight = edge weight between u and v
                if weight < key[v]:
                    update key[v] in minHeap  // Update the priority queue
                    add edge (u, v) to result  // Add edge to MST

    return result
```

## Explanation of Steps

1. **Initialization**:
   - Start with an arbitrary vertex (often the first vertex).
   - Set its key to 0 (indicating it’s the starting point).
   - Set the key values for other vertices to infinity, representing that they are not yet connected to the MST.

2. **Priority Queue**:
   - Use a priority queue (min-heap) to manage the vertices.
   - The queue prioritizes the edge with the smallest weight.

3. **Iterate**:
   - Extract the vertex with the minimum key value from the priority queue.
   - For each neighbor of this vertex, if the neighbor hasn't been visited and the edge weight is smaller than the current key of that neighbor, update the key value and add the edge to the MST.

4. **Terminate**:
   - The algorithm terminates when all vertices have been included in the MST (i.e., the priority queue is empty).

---

## Complexity

- **Time Complexity**:
  - **Priority Queue Operations**:
    - Extracting the minimum key takes \(O(\log V)\).
    - Decreasing the key also takes \(O(\log V)\).
  
  - **Edge Relaxation**:
    - For each vertex, the algorithm inspects all of its edges, leading to \(O(E)\) operations.
  
  - **Overall**:
    - \(O((V + E) \log V)\) using a priority queue with binary heap.
    - With Fibonacci heaps, the time complexity can be reduced to \(O(E + V \log V)\).

- **Space Complexity**:
  - \(O(V + E)\) for storing the graph (adjacency list).
  - \(O(V)\) for storing the priority queue and visited set.

---

# Summary of Differences from Kruskal’s Algorithm

- **Starting Point**:
  - Kruskal’s starts by sorting edges and adding them to the MST, while Prim’s starts from a single vertex and expands the tree by adding edges.

- **Cycle Detection**:
  - Prim's algorithm does not explicitly check for cycles, as it grows the tree incrementally and ensures no cycles are formed.

- **Graph Representation**:
  - Kruskal’s is more efficient for sparse graphs with edges that are already sorted or can be easily sorted.
  - Prim’s is efficient for dense graphs with a high number of edges.

---

Prim's algorithm is a widely used technique for constructing the Minimum Spanning Tree of a graph, and is efficient for solving practical problems in network design, clustering, and other optimization problems where spanning tree structures are required.

# Implementations
* [Lazy Prim](https://github.com/mc-0/DSA/blob/main/src/datastructures/graphs/mst/LazyPrimMST.java)
* [Prim MST](https://github.com/mc-0/DSA/blob/main/src/datastructures/graphs/mst/PrimMST.java)
