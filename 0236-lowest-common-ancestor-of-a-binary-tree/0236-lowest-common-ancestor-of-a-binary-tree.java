/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q)return root;
         TreeNode leftroot=lowestCommonAncestor(root.left,p,q);
        TreeNode rightroot=lowestCommonAncestor(root.right,p,q);
        if(leftroot!=null && rightroot!=null)return root;
        return leftroot!=null?leftroot:rightroot;
    }
}