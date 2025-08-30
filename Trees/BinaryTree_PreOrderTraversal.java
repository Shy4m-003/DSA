/**
 * Problem: Binary Tree Preorder Traversal (LeetCode #144)
 *
 * Approach:
 * - Recursive DFS
 * - Visit root → left → Right
 *
 * Time Complexity: O(n)  // every node is visited once
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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> result = new ArrayList<>();
       preorder(root,result);
       return result; 
    }

    public void preorder(TreeNode node, List<Integer>result){
        if(node != null){
            result.add(node.val);
            preorder(node.left,result);
            preorder(node.right,result);
        }
    }
}