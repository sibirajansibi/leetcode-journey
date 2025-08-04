class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        if(isPalin(s , i , j)){
            return true;
        }
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalin(s, i + 1, j) || isPalin(s, i, j - 1);
            }
             i++;
                j--;
        }
        return false;
    }

    public static boolean isPalin(String s , int i , int j  ){

        
        while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        i++;
        j--;
        }
        return true;
    }
}