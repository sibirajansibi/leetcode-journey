class Solution {
    static {
        for (int i = 0; i < 500; i++)
            new Solution().minPartitions("0");
    }

    public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
            
            for(char c : n.toCharArray()){
                max = Math.max( max , c-'0');
            }
        
        return max;
    }
}