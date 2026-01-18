class Solution {
    public String greatestLetter(String s) {
      boolean[] seen = new boolean[128]; 
        for (char c : s.toCharArray()) {
            seen[c] = true; 
        }
        for (int i = 25; i >= 0; i--) {
            char upper = (char) ('A' + i);
            char lower = (char) ('a' + i);
            if (seen[upper] && seen[lower]) {
              
                return String.valueOf(upper);
            }
        }
    
        return "";
    }

}