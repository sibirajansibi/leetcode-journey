class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int sum = 0;

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    sum += node.left.val;
                } else {
                    q.offer(node.left);
                }
            }

            if (node.right != null) {
                q.offer(node.right);
            }
        }

        return sum;
    }
}
