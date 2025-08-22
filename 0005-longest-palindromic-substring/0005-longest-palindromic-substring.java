class Solution {
    public String longestPalindrome(String s){
     
     String ans  ="";

     for(int i=0;i<s.length();i++){
        int a = i;
        int b = i;
        while(a>=0&&b<s.length()&& s.charAt(a)==s.charAt(b)){
            a--;
            b++;
        }
     
     String v = s.substring(a+1,b);
      if(v.length()> ans.length()){
        ans = v;
      }
            a = i;
            b = i+1;
        while(a>=0&&b<s.length()&& s.charAt(a)==s.charAt(b)){
            a--;
            b++;
        }
        v = s.substring(a+1,b);
         if(v.length()> ans.length()){
        ans = v;
         }

    }

     
return ans;
        
    }
}