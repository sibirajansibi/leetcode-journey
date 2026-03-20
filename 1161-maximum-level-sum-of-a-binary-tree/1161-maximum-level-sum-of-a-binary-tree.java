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
    public int maxLevelSum(TreeNode root) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<TreeNode> Q = new LinkedList<>();
        Q.offer(root);
int level = 1;
int max = Integer.MIN_VALUE;
        while(!Q.isEmpty()){
           int size = Q.size();
           int sum =0;
          for(int i =0; i < size;i++){
            TreeNode node = Q.poll();
            sum += node.val;
            if(node.left != null){
                Q.offer(node.left);
            }
             if(node.right != null){
                Q.offer(node.right);
            }
          }
          max = Math.max( max , sum);
          map.put(level++, sum);
        }
        List<Map.Entry<Integer , Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(( a, b) -> b.getValue() - a.getValue());
     
      return list.get(0).getKey();
    }
}