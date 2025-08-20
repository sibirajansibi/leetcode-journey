class Solution {
    public boolean repeatedSubstringPattern(String s) {
        

        int n = s.length();

        // Try every possible substring length
        for (int len = 1; len <= n / 2; len++) { 
            if (n % len == 0) {
                String sub = s.substring(0, len); 
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n / len; i++) {
                    sb.append(sub); //abababab
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}