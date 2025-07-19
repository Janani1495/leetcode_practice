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
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer>list=new ArrayList<>();
        return traverse(root,low,high,list);
    }
    public int traverse(TreeNode root,int low,int high,List<Integer>list){
        int sum=0;
        if(root!=null){
            traverse(root.left,low,high,list);
            if(root.val<=high && root.val>=low){
            list.add(root.val);
            }
            traverse(root.right,low,high,list);
        }
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        
        return sum;
    }
}