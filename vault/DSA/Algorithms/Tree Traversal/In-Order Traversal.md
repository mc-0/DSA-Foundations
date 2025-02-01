![[inorder.png]]

`In-Order Traversal` involves first visiting the left subtree, then visiting the root, and finally visiting the right subtree.  Typically within a [[Binary Trees|binary search tree]], you can retrieve all the nodes in sorted order using an in-order traversal.

### Recursive Approach
Like pre-order & post-order traversals, [[Depth-First Search]] is key for in-order's recursive implementation.

#### Pseudocode
1. Check if input root node is null (if yes return empty result)
2. Call recursive function on root node:
	* Wait for return
3. Return result
#### Recursive Function Steps:
1. Recursive call on left child
2. Add current node to result / marked as visited
3. Recursive call on right child
#### Recursive Implementation:
``` java
class Solution {
    private List<Integer> result = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return result;
        dfs(root);
        return result;
    }
    
    private void dfs(TreeNode node) {
        if (node.left != null) dfs(node.left);
        result.add(node.val);
        if (node.right != null) dfs(node.right);
    }
}
```

---
### Iterative Approach
An iterative solution utilizes a [[Stacks|stack]] data structure (which replicates the call-stack behavior of recursion).

#### Pseudocode
1. Check if input root node is null (if yes return empty result)
2. Create a `current` node variable & point it to the root / starting node
3. Initialize a Stack
4. While the `current` node is NOT null **OR** the stack is NOT empty:
	- `while` `current` node is NOT null:
		1. Push `current` node onto the stack
		2. Set `current` to `current`'s *left child*
	1. Pop the top node from the stack and set it to `current`
	2. Process the `current` node
	3. Set `current` node to `current`'s *right child*
6. Return the result
#### Iterative Implementation:
``` java
class Solution {
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        
        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Current must be null at this point
            current = stack.pop();
            result.add(current.val);

            // Move to the right subtree
            current = current.right;
        }
        return result;
    }
    
}
```
