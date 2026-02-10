class Solution {
    public int longestBalanced(int[] nums) {
         int[] trunk = nums;
        int n = trunk.length;





        
        
        int max =0;

        for (int z = 0; z < n; z++) {
            Set<Integer> evSet = new HashSet<>();
            Set<Integer> odSet = new HashSet<>();
            for (int j = z; j < n; j++) {
                int num = trunk[j];
                if (num % 2 == 0)
                    evSet.add(num);
                else
                    odSet.add(num);
                if (evSet.size() == odSet.size()) {
                    max = Math.max(max, j - z + 1);
                }
            }
        }
        return max;
    }
}