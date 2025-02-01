![stack drawio2](https://github.com/user-attachments/assets/b4daeed4-f2a2-4d00-9cf8-456b58174d17)

# Attributes
- LIFO Data Structure (Last In, First Out)

# Operations
|               |               |
|---------------|---------------|
| Push |    O(1)     |
| Pop |    O(1)     |
| Peek |    O(1)     |
| Size |    O(1)     |
| IsEmpty |    O(1)     |


# Trade Offs
#### Array Implementation
| PRO |    CON |
|----------|----------|
| PRO | CON |
|    Simple & Fast due to direct indexing      |    Fixed size (could overflow)   |
|     Good Cache Performance     |   Array resizing / copying can be costly       |

#### Linked List Implementation
| PRO |    CON |
|----------|----------|
|     Dynamic Size & No Wasted Space     |  Memory Overhead |
|      Easy To Implement    |  O(1) operations, but access might be slower due to non-contiguous memory allocation  |

# Common Uses
- Call stack (function call management)
- Undo mechanisms
- Syntax parsing
- DFS in Graph algorithms / backtracking

# Implementations
[Array & Linked List Based Stacks](https://github.com/mc-0/DSA/tree/main/src/datastructures/stacks)

# Resources
[Stack & Queue Overview w/ Dijkstra's Two-Stack Algorithm](https://www.youtube.com/watch?app=desktop&v=ncPxL3via0c)