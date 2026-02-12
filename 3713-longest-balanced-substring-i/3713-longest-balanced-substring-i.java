class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;
        // Try every possible substring starting at i
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int distinct = 0;      // Number of distinct characters in the window
            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'a';
                freq[idx]++;
                if (freq[idx] == 1) distinct++;

                if ((j - i + 1) % distinct == 0) { 
                    int val = freq[s.charAt(i) - 'a'];
                    boolean balanced = true;
                    for (int k = 0; k < 26; k++) {
                        if (freq[k] == 0) continue;
                        if (freq[k] != val) {
                            balanced = false;
                            break;
                        }
                    }
                    if (balanced) maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}
