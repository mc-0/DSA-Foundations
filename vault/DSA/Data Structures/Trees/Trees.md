![[Tree_Overview.png]]
# Attributes
#### Hierarchical Structure
Trees represent data in a parent-child relationship. Each node can have zero or more children, with no cycles (acyclic).
1. **Root Node**: The top node of a tree from which all other nodes descend. It has no parent.
2. **Child Nodes**: Nodes that are directly connected and below a given node are its children.
3. **Parent Node**: A node that has one or more child nodes.
4. **Leaf Node**: A node that has no children; it's at the end of a branch.
5. **Subtree**: A tree formed from a node and its descendants.
6. **Depth**: The length of the path from the root to a node.
7. **Height**: The length of the longest path from a node to a leaf. The height of the tree is the height of the root node.

8. **Balanced vs. Unbalanced**: 
   - _Balanced Trees_: A tree is balanced if the heights of the left and right subtrees of every node differ by at most a fixed amount (often 1). Balanced trees, like AVL trees or Red-Black trees, are designed to keep operations efficient (typically O(log⁡n)) for search, insertion, and deletion).
   - _Unbalanced Trees_: In an unbalanced tree, the height difference between subtrees can be significant, leading to inefficient operations. For example, in a binary search tree that is unbalanced, the tree could degenerate into a linked list with O(n) operation time.
9. **Completeness**: A complete tree is a binary tree in which all levels are fully filled except possibly the last level, which is filled from left to right. Complete trees are particularly useful in data structures like heaps, where completeness ensures efficient storage and access patterns.
10. **Full Trees**: A full binary tree is one in which every node has either 0 or 2 children (no nodes have only one child). This structure is specific to binary trees and ensures that each level, up to the last, has the maximum number of nodes.
11. **Perfect Trees**: A perfect binary tree is a stricter version of completeness: it is both full and complete, meaning all internal nodes have exactly two children, and all leaf nodes are at the same depth. In a perfect binary tree, the number of nodes at depth dd is 2d2d, making it an optimally balanced tree.

<img width="915" alt="trees" src="https://github.com/user-attachments/assets/26e5eedc-c8e9-46d2-afca-443112bdace3">

#### Traversal
| Type                      | Commonly Implemented With | Pattern                                   |
| ------------------------- | ------------------------- | ----------------------------------------- |
| [[In-Order Traversal]]    | DFS (Stack)               | Left Sub-tree, Root, Right Sub-tree       |
| [[Pre-Order Traversal]]   | DFS (Stack)               | Root, Left Sub-tree, Right Sub-tree       |
| [[Post-Order Traversal]]  | DFS (Stack)               | Left Sub-tree, Right Sub-tree, Root       |
| [[Level-Order Traversal]] | BFS (Queue)               | Root -> Queue children nodes @ each level |

# Operations
| Operation                 | Average Time Complexity | Worst-case Time Complexity |
|---------------------------|-------------------------|----------------------------|
| Access (search)            | O(log n) (balanced)     | O(n) (unbalanced)           |
| Insertion                  | O(log n) (balanced)     | O(n) (unbalanced)           |
| Deletion                   | O(log n) (balanced)     | O(n) (unbalanced)           |
| Traversal (Inorder/Preorder/Postorder) | O(n)            | O(n)                       |
| Find Minimum/Maximum       | O(log n) (balanced)     | O(n) (unbalanced)           |
| Tree Rotation (e.g., AVL or Red-Black Tree) | O(1)      | O(1)                       |
| Height Calculation | O(n) | O(n) |
| Check Balanced | O(n) | O(n) |
__Note: Other advanced structures have better performance (AVL, Red-Black Tree, B-Trees)__

# Trade Offs
| **Pros**                                               | **Cons**                                                   |
|--------------------------------------------------------|------------------------------------------------------------|
| Efficient searching and sorting with O(log n) time in balanced trees | Unbalanced trees can degrade to O(n) time complexity       |
| Great for hierarchical data representation (e.g., file systems) | Overhead for maintaining balance in self-balancing trees    |
| Supports dynamic operations like insertion and deletion | Higher space complexity due to node pointers (parent/child) |
| Provides efficient traversal methods (preorder, inorder, postorder) | Tree balancing (e.g., AVL/Red-Black) adds complexity       |
| Can store sorted data while allowing fast updates      | Difficult to implement compared to simpler structures like arrays or linked lists |

# Common Uses
1. **Hierarchical Data Representation**: Trees are excellent for representing data with inherent hierarchy, such as file systems, HTML/XML documents, and organizational charts.
2. **Binary Search Trees (BST)**: Commonly used in search algorithms where data is sorted. Used in databases and dictionaries.
3. **Balanced Trees (e.g., AVL, Red-Black Trees)**: Widely used in databases and filesystems for fast search, insert, and delete operations.
4. **Priority Queues**: Heap data structures (a type of binary tree) are used for implementing priority queues.
5. **Compilers**: Abstract syntax trees (ASTs) are used in compilers to represent program structure.
6. **Routing Algorithms**: Trees are used in networking for efficient routing and searching.
7. **Machine Learning**: Decision trees and random forests are common in supervised learning tasks.

# Implementations
- [Tree Implementation](https://github.com/mc-0/DSA/tree/main/src/datastructures/trees)
- [Binary Search Tree Implementation](https://github.com/mc-0/DSA/blob/main/src/datastructures/trees/BST.java)
- [Red-Black Tree Implementation](https://github.com/mc-0/DSA/blob/main/src/datastructures/trees/RedBlackBST.java)

# 2-3 Trees & Red-Black Trees
2-3 Trees are a way to optimize a tree data structure in order to ensure efficient operations. It's name references the number of child links a given node maintains as each node can have 1 or 2 keys. In a `2 Node` the typical binary search style approach is followed with lesser elements falling to the left and greater elements falling to the right. A `3 Node` maintains 2 ordered keys where a smaller / greater keys still fall to the left and right children, but keys that fall in the range between them move to a 3rd link in the middle of the node.

![image](https://github.com/user-attachments/assets/bf1a484d-2b9d-49b1-9bb5-b566907da283)

Red-Black Trees are such an implementation of 2-3 trees. The `colors` refer to the relationship of the keys and also allow for the tree to balance itself during operations. The `red` links of tree "glue" together nodes to represent a three node relationship. The Larger key acts as the root of the subtree with a left red-linked key being the other element of the 3 node. The `left leaning red-black tree` is but one specific implementation and maintains a few properties:
1. Red links lean left
2. No node can have 2 red links connected to it
3. Every path from the root to null link has the same # of black links (perfectly balanced)

The tree has operations to ensure it stays balanced:
- If a right child link is red and a left child link is black, the subtree rotates left
- If two red links exist in a row, the subtree rotates right
- If left and right links are both red, flip colors to become black

Red-black trees can be seen in Java's `TreeMap` & `TreeSet` implementations

![image](https://github.com/user-attachments/assets/1f312404-cb95-4623-94f3-4c8665b8571a)