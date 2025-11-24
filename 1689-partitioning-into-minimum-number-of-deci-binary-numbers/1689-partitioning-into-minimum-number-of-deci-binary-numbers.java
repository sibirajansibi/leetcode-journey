class Solution {
    public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
            
            for(char c : n.toCharArray()){
                max = Math.max( max , c-'0');
            }
        
        return max;
    }
}