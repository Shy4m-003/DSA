/**
 * Problem: Lowest Common Ancestor of the Binary Tree (LeetCode # 236)
 *
 * Approach:
 * - Recursive
 *
 *
 * Time Complexity: O(n)  // every node is visited once at worst case
 * Space Complexity: O(h) // recursion stack, h = tree height
 */

// ----------------Solution-------------------//
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root.val == p.val || root.val == q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null){
            return root;
        }
        if(left != null){
            return left;
        }
        else{
            return right;
        }
    }
}