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
    int ans = 1;
    
    public int diameterOfBinaryTree(TreeNode root) {
        goDeep(root);
        return ans - 1;
    }
    private int goDeep(TreeNode root){
        
        if(root==null) return 0;

        int left = goDeep(root.left);
        int right = goDeep(root.right);
        ans = Math.max(ans, 1 + left + right);
        return Math.max(left, right) + 1;
}
}