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
    public int maxDepth(TreeNode root) {
        int h=height(root);
        return h;
    }
    public int height(TreeNode root){
        if(root==null)return 0;
        int ls=height(root.left);
        int rs=height(root.right);
        int max=Math.max(ls,rs)+1;
        return max;
    }
}