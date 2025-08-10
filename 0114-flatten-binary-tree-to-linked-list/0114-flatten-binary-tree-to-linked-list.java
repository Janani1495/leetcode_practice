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
    public void flatten(TreeNode root) {
         List<Integer>list=new ArrayList<>();
         preorder(list,root);
         TreeNode temp=root;
         for(int i=1;i<list.size();i++){
            TreeNode val=new TreeNode(list.get(i));
            temp.left=null;
            temp.right=val;
            temp=temp.right;
         }
    }
    public void preorder(List<Integer>list,TreeNode root){
         
        if(root!=null){
            list.add(root.val);
            preorder(list,root.left);
            preorder(list,root.right);

        }
      
    }
}