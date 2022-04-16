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
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        return findMinDepth(root);
    }
    
    private int findMinDepth(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
                
        if (root.left == null && root.right == null) {
            return 1;
        }
        
        return Math.min(findMinDepth(root.left), findMinDepth(root.right)) + 1;
    }
}