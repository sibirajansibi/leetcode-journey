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
     public static  List<Integer> res;
    public List<Integer> inorderTraversal(TreeNode root) {
    res = new ArrayList<>();
    inorder(root);
    return res;
    }
    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
}
