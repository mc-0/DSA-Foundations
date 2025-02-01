![image](https://github.com/user-attachments/assets/8e18549c-162d-432e-ae01-929637bbc0d8)

# Attributes
- **Vertices (Nodes)**: Graphs are made up of a set of vertices, often representing entities or objects.
- **Edges (Links)**: The connections between the vertices, which can be directed or undirected.
- **Directed/Undirected**: In a directed graph, edges have a direction, indicating a one-way relationship. In an undirected graph, edges represent a mutual relationship.
- **Weighted/Unweighted**: A weighted graph has edges with a cost or value associated with them, whereas in an unweighted graph, all edges are treated equally.
- **Degree**: The number of edges connected to a vertex. For directed graphs, this is split into in-degree and out-degree.
- **Path**: A sequence of vertices connected by edges. In a simple path, vertices do not repeat.
- **Cycle**: A path where the starting and ending vertices are the same. A graph without cycles is called acyclic.
- **Connected Components**: In an undirected graph, connected components are groups of vertices where each vertex is reachable from any other vertex in the component.

#### Adjacency Lists: 
![image](https://github.com/user-attachments/assets/575ea3a9-72d6-4837-8eed-9990ce9e89c6)

- A space-efficient way to represent graphs by storing a list of adjacent vertices for each vertex.
   - Graph is represented by an array of lists
- Each index corresponds to a vertex
- The list at that index contain the vertices connected to it
- For an undirected graph: an edge connecting A & B will be present in A's list & B's list
- For a direct graph, the list at a given index represents the vertices that a particular vertex connects to

#### Adjacency Matrix
![image](https://github.com/user-attachments/assets/c7095734-d00e-435a-9f00-7a48971b2f9f)

- Represents a graph as a 2D array
- The position (i,j) indicates if an edge connects vertex i & vertex j
- Undirected graphs: The matrix is symmetric
- Directed graphs: The cell (i,j) will contain a 1 (true) or 0 (false), denoting whether an edge connects i to j
Adjacency Matrix: A 2D matrix representation where cells indicate the presence (and optionally, the weight) of an edge between vertex pairs.

# Operations
| Operation                | Adjacency List (Time Complexity)       | Adjacency Matrix (Time Complexity) |
|--------------------------|----------------------------------------|------------------------------------|
| Add Vertex               | O(1)                                   | O(V^2)                            |
| Add Edge (Unweighted)     | O(1)                                   | O(1)                              |
| Add Edge (Weighted)       | O(1)                                   | O(1)                              |
| Remove Vertex             | O(V + E)                               | O(V^2)                            |
| Remove Edge               | O(degree(v)) ≈ O(E/V) on average, O(V) in worst case | O(1)             |
| Check if Edge Exists      | O(degree(v)) ≈ O(E/V) on average, O(V) in worst case | O(1)             |
| Get All Neighbors (Vertex)| O(V) or O(E)                           | O(V)                              |
| Space Complexity          | O(V + E)                               | O(V^2)                             |
|    | Efficient for sparse graphs. More memory efficient with fewer edges relative to the # of vertices | Efficient for dense graphs. Better when graphs have many edges as checking for the presence of a graph is very quick |

# Trade Offs
#### **Adjacency Lists**  
|           |                             |
|-------------------------------|-----------------------------|
| **PRO**                       | **CON**                     |
| More space-efficient for sparse graphs (O(V + E)) | Slower to check if an edge exists (O(V) in worst case) |
| Faster to iterate over all edges of a vertex | Larger graph traversal time (because of linked lists) |
| Easy to store additional information like edge weights | Requires more complex structures to manage nodes |

#### **Adjacency Matrices** 
|         |                             |
|-------------------------------|-----------------------------|
| **PRO**                       | **CON**                     |
| Faster to check the existence of an edge (O(1)) | High space complexity for sparse graphs (O(V^2)) |
| Simple to implement and manage with arrays | Slow for adding/removing vertices (O(V^2) reallocation) |
| Efficient for dense graphs     | Traversal of neighbors takes O(V) for each vertex |

# Common Uses
- **Social Networks**: To model relationships between users (e.g., friendships, followers).
- **Transportation Networks**: For routing and pathfinding (e.g., road networks, airline routes).
- **Web Graphs**: Representing the structure of the web, where pages are vertices and links are edges.
- **Dependency Resolution**: Used in build systems, where nodes represent tasks and edges indicate dependencies.
- **Computer Networks**: For routing, where nodes are computers or routers, and edges represent data connections.
- **Recommendation Systems**: Nodes are users/items, and edges represent interactions or similarities.
- **Biological Networks**: Representing systems like metabolic networks or neural connections.

# Implementations
[Graph Implementation](https://github.com/mc-0/DSA/tree/main/src/datastructures/graphs)