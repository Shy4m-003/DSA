/**
 * Problem: Binary Tree level Traversal (LeetCode #102)
 *
 * Approach:
 * - Iterative
 *
 * Time Complexity: O(n)  // every node is visited once
 * Space Complexity: O(w), where ww is maximum level width, worst O(n)O(n)
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0; i < levelSize; i++){
                TreeNode node = queue.poll();
                currentLevel.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
             result.add(currentLevel);
        }
        return result;
    }
}