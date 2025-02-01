![[levelorder.png]]

`Level Order Traversal` aims to traverse a tree level-by-level. Starting first at the root node and then visiting all of it's neighbors before moving on to the next level.

The most common and straight forward approach involves the use of a [[Queues|queue]] to keep track of the nodes to be visited. In Java, `java.util` provides a queue interface which can be implemented by various concrete classes. This interface provides:
- `.offer(E e)` - which pushes an element onto the queue
- `.poll()` - which dequeues the next element (or null is the queue is empty)


#### Queue-Based Implementation
```java
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        List<List<Integer>> result = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int queueSize = queue.size();
            
            while (queueSize > 0) {
                TreeNode current = queue.poll();
                if (current == null) break;
                level.add(current.val);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
                queueSize--;
            }
            result.add(level);
        }
        return result;
    }
}
```