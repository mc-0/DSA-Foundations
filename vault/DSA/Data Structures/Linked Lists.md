
![LLdrawio](https://github.com/user-attachments/assets/6c7d148a-3022-4aef-9714-0fcd7b3ed15a)

# Attributes
1. **Dynamic Size**: Unlike arrays, linked lists grow and shrink dynamically with insertions and deletions.
2. **Non-contiguous Memory**: Elements are stored in non-contiguous memory locations, linked using pointers.
3. **Efficient Insertions/Deletions**: Insertions and deletions at the beginning or middle of a linked list are efficient (O(1) for head insertions).
4. **Sequential Access**: No direct access to elements; must traverse from the head to access any node (O(n) for access).
5. **Extra Memory for Pointers**: Each node stores data and a pointer (or multiple pointers in doubly linked lists) to the next node, requiring extra memory.
6. **Variations**: Includes singly linked lists, doubly linked lists, and circular linked lists.

# Operations
|               |       Singly-Linked        |  Doubly-Linked             |
|---------------|---------------|---------------|
| Insert @ Head |      O(1)         |       O(1)        |
| Insert @ Tail|       O(n) / O(1)*        |      O(1)         |
| Insert @ Specific Position |       O(n)        |       O(n)        |
| Delete @ Head |        O(1)       |       O(1)        |
| Delete @ Tail |      O(n) / O(1)*         |         O(1)      |
| Delete @ Specific Position |      O(n)         |       O(n)        |
| Search |       O(n)        |      O(n)         |
| Traversal |       O(n)        |       O(n)        |
| Reversal |       O(n)        |        O(n)       |
| Backward Traversal |     __N/A__          |      O(n)         |

_Note: * - Singly Linked List tail operations can be O(1) if you maintain a tail pointer_


# Trade Offs
|  PRO             |    CON           |
|---------------|---------------|
| Dynamic in size | Memory overhead for pointers |
|Efficient inserts / deletes (no shifting required | Sequential access (must start at head / tail |
|                 | Poor cache performance as nodes are scatters in memory |

# Common Uses
- Dynamic memory management
- Stack & Queue implementations
- Chaining in Hash Tables

# Implementations
[Singly, Doubly, & Node](https://github.com/mc-0/DSA/tree/main/src/datastructures/linkedlists)

