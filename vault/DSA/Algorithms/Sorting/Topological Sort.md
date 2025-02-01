![63bd7ad6-403c-42f1-b8bb-2ea41e42af9a_1613794080 8115625](https://github.com/user-attachments/assets/f7f54a00-a586-401b-8b3f-79285d496a50)

# Overview
* Topological Sort is a graph traversal algorithm which plays an important role in precedence scheduling (i.e., where certain tasks or events can only occur when related dependent tasks are performed first). 
* Relies on `Directed Acyclic Graphs` or graphs in which there are no cycles. 
* If a cycle exists, a graph cannot be topologically sorted.
* `Reverse DFS Post Order` = topological ordering - it represents the order when a vertex is finished from subsequent [[Depth-First Search|DFS]] calls

# Kahn's Algorithm | [Implementation](https://github.com/mc-0/DSA/blob/main/src/patterns/topologicalsort/TopologicalSort.java)
```
1. Compute the in-degree of each node in the graph.
2. Identify nodes with no incoming edges (in-degree = 0) and initialize a structure to hold them.
3. While there are nodes with no incoming edges:

    Remove a node from the structure and add it to the sorted result.
    For each outgoing edge from this node:
        Reduce the in-degree of the target node.
        If the in-degree of the target node becomes 0, add it to the structure.

4. If all nodes are in the sorted result, return the result as the topological order.
5. Otherwise, the graph has a cycle and cannot be sorted topologically. 
```

# DFS Based Algorithm | [Implementation](https://github.com/mc-0/DSA/blob/main/src/searching/DepthFirstOrder.java)
```
1. Use a structure to track visited nodes.
2. Use another structure (e.g., a stack or list) to store the nodes in reverse topological order.
3. For each un-visited node in the graph:

    Perform a recursive visit:
        Mark the node as visited.
        Recur for all its neighbors.
        Add the node to the result structure after all its neighbors are processed.

4. Reverse the order of the result structure to get the topological order.
```