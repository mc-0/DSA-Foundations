![[postorder.png]]

`Post-Order Traversal` involves first visiting the left subtree, then visiting the right subtree, and finally visiting the root.  Deleting nodes in a tree does so in a post-order fashion where you will delete the left child, right child, and then the parent node. Post-order traversal is also widely used in mathematical expressions as they're easy to handle with a [[Stacks|stack]] where nodes are pushed on, and when an operator is encountered, the top 2 nodes are popped off, the calculation is performed, and the calculated value to push back onto the stack.

### Recursive Approach
Like pre-order & in-order traversals, [[Depth-First Search]] is key for post-order's recursive implementation.

#### Pseudocode
1. Check if input root node is null (if yes return empty result)
2. Call recursive function on root node:
	* Wait for return
3. Return result
#### Recursive Function Steps:
1. Recursive call on left child
2. Recursive call on right child
3. Add current node to result / marked as visited
#### Recursive Implementation:
``` java
class Solution {
    private List<Integer> result = new ArrayList<>();
    
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return result;
        dfs(root);
        return result;
    }
    
    private void dfs(TreeNode node) {
        if (node.left != null) dfs(node.left);
        if (node.right != null) dfs(node.right);
        result.add(node.val);
    }
}
```

---

### Iterative Approach
An iterative solution utilizes a [[Stacks|stack]] data structure
#### Pseudocode
1. Check if input root node is null (if yes return empty result)
2.  Initialize **two** stacks
	- Push the root / start node to the 1st stack
3.  While `stack1` is NOT empty:
	- Pop the top node from the stack and set it to `current`
	- Push `current` to `stack2`
	- If `current`'s *left child* is NOT null: push it to `stack2`
	- If `current`'s *right child* is NOT null: push it to `stack2`
4.  While `stack2` is NOT empty:
	- Pop the top node & process it / add it to result
5. Return the result
#### Iterative Implementation:
```java
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        List<Integer> result = new ArrayList<>();
        
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        
        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode current = stack1.pop();
            stack2.push(current);
            
            if (current.left != null) stack1.push(current.left);
            if (current.right != null) stack1.push(current.right);
        }
        
        while (!stack2.isEmpty()) {
            result.add(stack2.pop().val);
        }
        
        return result;
    }
}
```
