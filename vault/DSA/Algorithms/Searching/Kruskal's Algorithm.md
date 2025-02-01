
![6RCFr](https://github.com/user-attachments/assets/52d47d70-71f3-4b6e-8132-7e1272e8eb42)


# Overview
Kruskal's Algorithm is a greedy algorithm used to find the Minimum Spanning Tree (MST) of a connected, weighted, and undirected [[Graphs|graph]]. The MST is a subset of the graph's edges that connects all vertices with the minimum possible total edge weight and without forming cycles.

# Key Characteristics
1. Greedy Strategy:
   - Selects the edges with the smallest weights while ensuring no cycles are formed.

2. Cycle Detection:
   - Uses a Disjoint Set Union (DSU) (or [[Algorithms/Case Studies/Union Find]]) data structure to efficiently detect and prevent cycles.

3. Input Requirement:
   - The graph must be connected (all vertices are reachable).

4. Applications:
   - Network design (e.g., designing communication or road networks).
   - Approximation algorithms in clustering.
5. Efficiency:
   - Performs well on sparse graphs (graphs where E is much smaller than V^2).
   - Edge-based (compared to Prim's which is vertex-based)

# General Pseudocode
```
kruskalAlgorithm(graph):
    result = []                  // List to store MST edges
    edges = graph.edges          // Get all edges of the graph
    sort(edges, by weight)       // Sort edges in ascending order of weight
    initializeDisjointSet(graph) // Initialize Union-Find for vertices

    for edge in edges:
        u, v = edge.vertices
        if find(u) != find(v):   // Check if adding edge creates a cycle
            result.add(edge)     // Include the edge in the MST
            union(u, v)          // Merge the sets of u and v

    return result                // Return MST edges
```

### Process
1. Sort Edges:
   * All edges are sorted in non-decreasing order of their weights.

2. Initialize Disjoint Set:
   * Each vertex starts as its own set.
   * Disjoint Set Union-Find operations (find, union) ensure no cycles.

3. Iterate Through Edges:
   * Consider edges one by one in sorted order.
   * Add an edge to the MST only if it connects two previously disjoint components.

4. Terminate:
   * The algorithm stops when V−1 edges are added to the MST, where V is the number of vertices.

# Complexity
* Time Complexity:
   * Sorting Edges: O(Elog⁡E), where E is the number of edges.
   * Union-Find Operations: O(α(V)) per operation using path compression and union by rank, where αα is the inverse Ackermann function (very small in practice).
    Overall: O(Elog⁡E+E⋅α(V)), which simplifies to O(Elog⁡E) as E≥V.

* Space Complexity:
   * O(V) for the Union-Find data structure.
    * O(E) for storing the edges.

# Implementations
[Kruskel's MST](https://github.com/mc-0/DSA/blob/main/src/datastructures/graphs/mst/KruskalMST.java)
