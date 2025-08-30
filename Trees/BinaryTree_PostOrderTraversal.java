/**
 * Problem: Binary Tree Postorder Traversal (LeetCode #145)
 *
 * Approach:
 * - Recursive DFS
 * - Visit Left → Right → Root
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }
    public void postorder(TreeNode node, List<Integer> result){
        if(node != null){
            postorder(node.left,result);
            postorder(node.right,result);
            result.add(node.val);
        }
    }
}