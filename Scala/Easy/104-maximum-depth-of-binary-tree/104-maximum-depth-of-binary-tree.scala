/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def maxDepth(root: TreeNode): Int = {
        if( root == null) return 0;
        
        val left = maxDepth(root.left);
        val right = maxDepth(root.right);
        return left.max(right) + 1;
    }
}