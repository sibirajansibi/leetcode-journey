class Solution {
    public boolean isPalindrome(String s) {

        String ans = "";

        int i = 0;
        int j = s.length() - 1;

        s = s.toLowerCase();

      for(int k =0;k<s.length();k++){
        
        if (Character.isLetter(s.charAt(k)) || Character.isDigit(s.charAt(k))) {
                ans += s.charAt(k);

            }
      }
       System.out.print(ans);
         i = 0;
         j = ans.length()-1;
       while(i<j){
        if(ans.charAt(i) != ans.charAt(j)){
            return false;
        }
        i++;
        j--;

       }
        

return true;         
        

    }
}