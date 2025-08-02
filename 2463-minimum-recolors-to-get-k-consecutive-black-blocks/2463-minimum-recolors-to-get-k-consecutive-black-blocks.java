class Solution {
    public int minimumRecolors(String blocks, int k) {
                int minRecolor = Integer.MAX_VALUE;
        int whiteCount = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
        }
        minRecolor = whiteCount;
        // Sliding window approach
        for (int i = k; i < blocks.length(); i++) {
            
            if (blocks.charAt(i - k) == 'W') {
                whiteCount--;
            }
           
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
            minRecolor = Math.min(minRecolor, whiteCount);
        }
        return minRecolor;  
    }
}