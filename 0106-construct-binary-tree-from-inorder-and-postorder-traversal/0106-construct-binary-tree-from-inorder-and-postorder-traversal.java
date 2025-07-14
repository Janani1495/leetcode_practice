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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }

    private TreeNode build(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, HashMap<Integer, Integer> map) {
        if (is > ie || ps > pe) return null;

        TreeNode root = new TreeNode(postorder[pe]);
        int rootIndex = map.get(root.val);
        int leftSize = rootIndex - is;

        root.left = build(inorder, is, rootIndex - 1, postorder, ps, ps + leftSize - 1, map);
        root.right = build(inorder, rootIndex + 1, ie, postorder, ps + leftSize, pe - 1, map);

        return root;

    }
}