![array-2](https://github.com/user-attachments/assets/b43c75ba-2022-4f9f-8c1b-515753d40ee4)

# Attributes
- Index accessed
- Contiguous block of memory
- Static (fixed size at creation) or dynamic (capacity can grow / shrink)
- Homogeneity of data

# Operations
|               |               |
|---------------|---------------|
| Access |     O(1) - Constant     |
| Update |       O(1) - Constant   |
| Insert (End) |      O(1) - Constant    |
| Insert (Specific Index) |     O(n) - Linear     |
| Delete (End) |    O(1) - Constant      |
| Delete (Specific Index)|   O(n) - Linear       |
| Copy |     O(n) - Linear     |
| Traversal |    O(n) - Linear      |
| Linear Search |     O(n) - Linear     |
| Binary Search |      O(log n) - Logarithmic    |

# Trade Offs
|  PRO             |    CON           |
|---------------|---------------|
| Fast Access | Fixed Size (if static) |
| Memory Efficient | Costly inserts / deletes |
| Simple to use | Homogeneous inflexibility |

# Common Uses
- Caching / Look-ups
- Matrix Operations
- Foundation of building other data structures

# Implementations
[Dynamic Array Implementation](https://github.com/mc-0/DSA/tree/main/src/datastructures/arrays)