![picture2](https://github.com/user-attachments/assets/10bfa27c-1183-4718-8d5b-3e6c089dc59f)

# Attributes
A Heap is a specialized binary tree-based data structure that satisfies the heap property:
- Min-Heap: The value of each node is less than or equal to the values of its children. Hence, the smallest element is at the root.
- Max-Heap: The value of each node is greater than or equal to the values of its children. Hence, the largest element is at the root.

Additional Attributes:
- Complete Binary Tree: Heaps are complete binary trees, meaning all levels are fully filled except possibly the last, which is filled from left to right.
- Efficiently Implemented Using Arrays: Heaps can be stored in arrays, where for a node at index i, its left child is at 2i + 1 and right child at 2i + 2.

# Operations
| Operation            | Time Complexity | Description                                                        |
|----------------------|-----------------|--------------------------------------------------------------------|
| Insert (add element)  | O(log n)        | Insert an element at the end, then "bubble up" to maintain heap property. |
| Extract-Min/Max       | O(log n)        | Remove the root (min or max), replace it with the last element, then "heapify". |
| Peek (Min/Max)        | O(1)            | Retrieve the root without removing it.                             |
| Heapify (build heap)  | O(n)            | Convert an unsorted array into a heap (faster than n * O(log n)).   |
| Delete                | O(log n)        | Remove an arbitrary element and restore the heap property.          |
| Decrease/Increase Key | O(log n)        | Modify a key and adjust heap to restore the heap property.          |
| Build Heap | O(n) | Creating a heap from an unsorted array |


# Trade Offs
| PRO                                        | CON                                                          |
|--------------------------------------------|---------------------------------------------------------------|
| Efficient O(1) access to min/max element    | Limited to fast access only for min/max; not suitable for arbitrary searches |
| O(log n) insertions and deletions          | Insertion/removal is slower than simpler structures like arrays or linked lists |
| Space-efficient array representation       | Not as flexible or easy to traverse as other binary tree structures |
| Optimal for priority queue operations      | Less efficient for full sorting compared to some other algorithms (e.g., Quicksort) |
| Useful in graph algorithms (Dijkstra, Prim) | Heap operations can become costly if constant rebalancing is needed in dynamic scenarios |


# Common Uses
1. **Priority Queues**: Heaps are widely used to implement priority queues, where elements are dequeued based on priority (min or max).
2. **Graph Algorithms**:
   - **Dijkstra's Algorithm**: Min-heaps are used to efficiently fetch the next closest node.
   - **Prim's Algorithm**: Heaps help efficiently select the minimum-weight edge.

3. **Heap Sort**: Heaps can be used to sort data in O(n log n) time through Heapsort. This involves building a min/max heap & then extracting the next min/max element to produce a sorted array.
4. **Scheduling Systems**: Heaps can manage tasks with varying priorities in operating systems or task schedulers.
5. **Median Maintenance**: Two heaps (a min-heap and a max-heap) can be used to maintain a dynamic set of numbers and quickly access the median.

# Implementations
[Heap Implementation](https://github.com/mc-0/DSA/blob/main/src/datastructures/heaps/Heap.java)

