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
        if(root == null){
            return 0;
        }

        Queue<TreeNode> Q = new LinkedList<>();
        int depth = 1;
        Q.offer(root);

        while(!Q.isEmpty()){
            int size = Q.size();
            for(int i =0;i<size;i++){
              TreeNode temp = Q.poll();

                 if (temp.left == null && temp.right == null) {
                    return depth;
                }
                
                if(temp.left!= null){
                    Q.offer(temp.left);
                }
                if(temp.right!=null){
                    Q.offer(temp.right);
                }
            }
            depth++;
        }

return depth;
    }
}