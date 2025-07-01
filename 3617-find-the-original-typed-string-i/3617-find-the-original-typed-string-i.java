class Solution {
    public int possibleStringCount(String s) {
        int count =1;
        for(int i = s.length()-1;i>=1;i--){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
        }
         return count;
 
        
        
    }
}