class Solution {
    public String greatestLetter(String s) {

        HashSet<Character> set = new HashSet<>();

        for(char c : s.toCharArray()){
            set.add(c);
        }
        
        for(int i = 26; i >= 0 ;i--){
            char up = (char) ( i+'A');
            char lp = (char)  (i+'a');
            if(set.contains(up) && set.contains(lp)){
                return up+"";
            }
        }
        return "";
    }
}