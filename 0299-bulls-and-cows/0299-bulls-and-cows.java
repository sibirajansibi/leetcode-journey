class Solution {
    public String getHint(String s, String t) {
        int[] freq = new int[10];
        int bull = 0;
        int cow = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                bull++;
            } else {
               
                if (freq[s.charAt(i) - '0']++ < 0) cow++;
              
                if (freq[t.charAt(i) - '0']-- > 0) cow++;
            }
        }
        return bull + "A" + cow + "B";
    }
}
