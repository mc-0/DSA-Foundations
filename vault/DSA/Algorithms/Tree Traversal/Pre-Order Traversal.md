![[preorder.png]]

In *pre-order traversal* starts by visiting the root node 1st, then visits the left subtree, and finally visits the right subtree. 
### Recursive Approach
Like in-order & post-order traversals, [[Depth-First Search]] is key in it's recursive implementation.

#### Pseudocode
1. Check if input root node is null (if yes return empty result)
2. Call recursive function on root node:
	* Wait for return
3. Return result
#### Recursive Function Steps:
1. Add current node to result / marked as visited
2. Recursive call on left child
3. Recursive call on right child
#### Recursive Implementation:
```java
class Solution {
    List<Integer> result = new ArrayList<>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return result;
        
        dfs(root);
        return result;        
    }
    
    private void dfs(TreeNode node) {
        result.add(node.val);
        if (node.left != null) dfs(node.left);
        if (node.right != null) dfs(node.right);
    }
}
```

---
### Iterative Approach
An iterative solution utilizes a [[Stacks]] data structure
#### Pseudocode
1. Check if input root node is null (if yes return empty result)
2. Initialize a Stack
	- Push root node onto the stack
3. While the stack is NOT empty:
	1. Pop the next node from the top of the stack
	2. Add the value of the popped node to the result
	3. Push the *right child* of the popped node onto the stack
	4. Push the *left child* of the popped node onto the stack
4. Return the result
#### Iterative Implementation:
```java
class Solution {
    
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return result;
        
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode popped = stack.pop();
            result.add(popped.val);
            
            if (popped.right != null) stack.push(popped.right);
            if (popped.left != null) stack.push(popped.left);
        }
        
        return result;
    }
}

```
