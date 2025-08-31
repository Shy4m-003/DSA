/**
 * Problem: Sum of Left Leaves (LeetCode # 404)
 *
 * Approach:
 * - Iterative
 *
 * Time Complexity: O(n)  // every node is visited once
 * Space Complexity: O(w), where ww is maximum level width, worst O(n)
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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            if(curr.left != null){
                if(curr.left.left == null && curr.left.right == null){
                    sum += curr.left.val;
                }
                queue.offer(curr.left);
            }
            if(curr.right != null){
                queue.offer(curr.right);
            }
        }
        return sum;
    }
}