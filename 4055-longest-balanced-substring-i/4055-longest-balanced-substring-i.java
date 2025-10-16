class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                if (isBalanced(freq)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
    
    private boolean isBalanced(int[] freq) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : freq){
            if( num ==0) continue;
            set.add(num);
        }
        
        return set.size()==1;
    }
}
