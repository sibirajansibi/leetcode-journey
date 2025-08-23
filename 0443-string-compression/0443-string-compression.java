class Solution {
    public int compress(char[] chars) {
       int c=0;
       int k=0;
       for(int i=0;i<chars.length;i++){
        c++;
          if(i+1>=chars.length||chars[i]!=chars[i+1]){
            if(c==1){
                c=0;
                chars[k++]=chars[i];
                continue;
            }
            else{
                chars[k++]=chars[i];
                for(char x:Integer.toString(c).toCharArray()){
                    chars[k++]=x;
                }
                c=0;
            }
          }
          
       }
       return k;
    }

}