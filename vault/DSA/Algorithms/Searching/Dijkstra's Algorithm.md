
![1_rX7jt8J61Pyeu6Qb98mXUg](https://github.com/user-attachments/assets/307356f3-974c-482e-b7e9-15e07a8e14c5)


# Overview

Dijkstra's algorithm is a well-known algorithm used to find the shortest path between a starting node and all other nodes in a weighted graph. It works by repeatedly selecting the node with the smallest tentative distance, updating its neighboring nodes, and marking it as "visited."

# Key Characteristics

- **Single-Source Shortest Path**:
  - Dijkstra’s algorithm finds the shortest path from a single source node to all other nodes in a graph with non-negative edge weights.

- **Greedy Approach**:
  - The algorithm uses a greedy strategy, always selecting the node with the smallest tentative distance, which ensures that the shortest path to that node is found.

- **Time Complexity**:
  - Using a priority queue (min-heap), the time complexity is \(O((V + E) \log V)\), where \(V\) is the number of vertices and \(E\) is the number of edges.

- **Space Complexity**:
  - The space complexity is \(O(V)\), where \(V\) is the number of vertices, as we need to store the distances and predecessors for each node.

---

# General Pseudocode

```plaintext
dijkstra(graph, source):
    dist[source] = 0                       // Set the distance to the source to be 0
    for each node in graph:
        if node != source:
            dist[node] = infinity          // Initialize distances of all other nodes to infinity
        prev[node] = undefined            // Initialize previous node of each node as undefined
    
    Q = priority queue with all nodes      // Create a priority queue (min-heap) to store nodes with tentative distances
    while Q is not empty:
        u = Q.extract_min()                // Get the node u with the smallest distance
        for each neighbor v of u:
            alt = dist[u] + weight(u, v)   // Calculate the alternative distance through u to v
            if alt < dist[v]:              // If this new distance is smaller, update dist[v]
                dist[v] = alt
                prev[v] = u
                Q.decrease_priority(v, alt)   // Update the priority queue with the new smaller distance
    
    return dist, prev                     // Return the distance array and the previous node array
```

# Explanation of Steps

1. **Initialization**:
   - Initialize the distance to the source node as 0 (`dist[source] = 0`), and set the distance to all other nodes as infinity (`dist[node] = infinity`).
   - The previous node for each node is initially set as undefined.
   - All nodes are added to a priority queue, with their tentative distances serving as the priority.

2. **Main Loop**:
   - The algorithm iteratively extracts the node \(u\) with the smallest tentative distance from the priority queue.
   - For each neighbor \(v\) of node \(u\), the algorithm calculates the alternative distance (`alt`) through node \(u\) as `dist[u] + weight(u, v)`.
   - If the new distance `alt` is smaller than the current distance `dist[v]`, the algorithm updates `dist[v]` and sets the previous node of \(v\) to \(u\). This allows the algorithm to reconstruct the shortest path once all nodes have been visited.
   - The priority queue is updated to reflect the new distance for node \(v\).

3. **Termination**:
   - The algorithm terminates when the priority queue is empty, meaning all nodes have been processed and the shortest distances to all nodes have been found.

4. **Result**:
   - The algorithm returns the `dist` array, which contains the shortest distance from the source node to each node in the graph.
   - The `prev` array can be used to reconstruct the shortest path by tracing back from each node to the source.

---

# Complexity

- **Time Complexity**:
  - The time complexity of Dijkstra's algorithm depends on the data structure used for the priority queue.
  - Using a priority queue implemented with a min-heap, the time complexity is \(O((V + E) \log V)\), where:
    - \(V\) is the number of vertices,
    - \(E\) is the number of edges.
  - Each extract-min operation and decrease-priority operation takes \(O(\log V)\), and there are \(V\) extract-min operations and \(E\) edge relaxations.

- **Space Complexity**:
  - The space complexity is \(O(V)\) because we need to store the distances and the previous node for each vertex in the graph.
  - Additionally, the priority queue requires \(O(V)\) space to store all the nodes.

---

# Key Characteristics

- **Greedy Nature**:
  - Dijkstra’s algorithm is greedy because it makes a series of locally optimal choices by selecting the node with the smallest tentative distance at each step, ensuring the overall shortest path.

- **Non-Negative Weights**:
  - Dijkstra’s algorithm only works correctly if all edge weights are non-negative. If negative weights are present, the algorithm can give incorrect results. In that case, algorithms like Bellman-Ford should be used instead.

- **Efficiency**:
  - Dijkstra’s algorithm is highly efficient, especially for sparse graphs with fewer edges compared to the number of vertices. The use of a priority queue helps optimize the algorithm to handle large graphs.

- **Path Reconstruction**:
  - Dijkstra’s algorithm allows for easy reconstruction of the shortest path from the source node to any other node by following the `prev` pointers.

---

# Use Cases

- **Shortest Path in Road Networks**:
  - Dijkstra’s algorithm is commonly used for finding the shortest path in maps and navigation systems, where the nodes represent locations and edges represent road segments with distances as weights.

- **Routing Protocols**:
  - It is used in routing protocols, such as Open Shortest Path First (OSPF), to find the shortest path for data packets in computer networks.

- **Robotics and Path Planning**:
  - In robotics, Dijkstra’s algorithm is used for path planning in environments where obstacles need to be avoided while finding the shortest path.

- **Graph Analysis**:
  - Dijkstra’s algorithm is widely used in various graph analysis problems where the shortest path from a source node to other nodes is required.

---

# Summary

Dijkstra’s algorithm is a highly efficient and widely-used algorithm for finding the shortest paths from a single source node to all other nodes in a graph with non-negative edge weights. The algorithm uses a greedy approach and a priority queue to ensure optimal performance, with a time complexity of \(O((V + E) \log V)\). It is used in various applications such as road networks, routing protocols, and robotics. Although it cannot handle negative edge weights, its efficiency and practicality in many real-world problems make it a key tool in graph analysis.

# Implementations
* [Dijkstra's Algorithm]()