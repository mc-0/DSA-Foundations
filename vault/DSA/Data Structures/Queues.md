![Queue-Data-Structures](https://github.com/user-attachments/assets/555c707f-bf39-47f1-b07e-7495ad18fe4e)

# Attributes
- FIFO Data Structure (First In, First Out)
- Double-Ended Queues (_Deques_) have the same operations to queue / dequeue from either end
- [[Heaps|Priority Queues]] remove elements based on priory & not order

# Operations
|               |               |
|---------------|---------------|
| Enqueue |    O(1)     |
| Dequeue |    O(1)     |
| Peek |    O(1)     |
| Size |    O(1)     |
| IsEmpty |    O(1)     |


# Trade Offs
#### Array Implementation
| **Pros**                              | **Cons**                               |
|---------------------------------------|----------------------------------------|
| Simple implementation with fixed size | Fixed-size arrays may waste space if not full |
| Amortized O(1) enqueue and dequeue    | Resizing requires O(n) time complexity |
| Cache-friendly, good memory locality  | Needs resizing logic to handle overflow |
| Easy random access by index           | Memory reallocation during resize can be costly |
| Efficient for small, known sizes      | Wastes memory if array is resized too frequently |


#### Linked List Implementation
| **Pros**                              | **Cons**                               |
|---------------------------------------|----------------------------------------|
| Dynamic size (grows and shrinks)      | Higher memory overhead due to pointers |
| No need for resizing or fixed capacity| More complex implementation            |
| O(1) enqueue and dequeue operations   | Poor cache locality compared to arrays |
| Memory-efficient for variable data    | Extra memory for storing node pointers |
| Suitable for unpredictable sizes      | Slower for smaller data compared to arrays |


# Common Uses
- OS Task Scheduling
- [[Breadth-First Search|BFS]] in Graph algorithms that traverse layer by layer
- Network Packet Handling
- E-commerce order processing
- Print Queues

# Implementations
[Array & Linked List Queue Implementations](https://github.com/mc-0/DSA/tree/main/src/datastructures/queues)

# Resources
