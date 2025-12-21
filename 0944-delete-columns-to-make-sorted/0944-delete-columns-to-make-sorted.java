class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int cols = strs[0].length();
        int count = 0;

       
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row <n - 1; row++) {
                if (strs[row].charAt(col) > strs[row + 1].charAt(col)) {
                    count++; 
                    break;
                }
            }
        }
        return count;
    }
}
