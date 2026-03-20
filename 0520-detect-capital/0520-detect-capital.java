class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag = false;
        if(Character.isUpperCase(word.charAt(0))){
           flag = isNOT(word.substring(1));
           if(flag){
            return true;
           }
        }
         return (isNOT(word) || isALL(word) || flag);
    }
     public boolean isNOT(String word) {
        int count  =0;
         for(char c : word.toCharArray()){
           int x = c-0;
           if(x > 90){
            count++;
           }
          
         }
          return word.length() == count;
    }
     public boolean isALL(String word) {
        int count  =0;
         for(char c : word.toCharArray()){
           int x = c-0;
           if(x <= 90){
            count++;
           }
         
         }
           return word.length() == count;
    }

    
}