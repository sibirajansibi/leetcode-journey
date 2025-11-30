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
    public int sumNumbers(TreeNode root) {
      return  dfs(root , 0);
     
    }
    public static int dfs(TreeNode node , int val){
        if(node == null){
            return 0;
        }
        val = val*10 + node.val;
        if(node.left == null&&node.right ==null){
            return val;
        }
        int leftsum = dfs(node.left , val);
        int rightsum = dfs(node.right , val);

        return leftsum+rightsum;
    }
}