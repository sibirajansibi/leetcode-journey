class Solution {
    public String sortVowels(String s) {
        String v = "aeiouAEIOU";
StringBuilder sb = new StringBuilder();
StringBuilder vow = new StringBuilder();
        for(char  c  : s.toCharArray()){
            if(v.indexOf(c)==-1){
                sb.append(c);
            }else{
                sb.append('_');
                vow.append(c);
            }
        }
        char [] ch = vow.toString().toCharArray();
        Arrays.sort(ch);
        StringBuilder sbk = new StringBuilder(new String(ch));
        StringBuilder ans = new StringBuilder();
        int k =0;
        for(char  c : sb.toString().toCharArray()){
            if(c =='_'){
             ans.append(sbk.charAt(k));
           
             k++;
            }else{
                ans.append(c);
            }
        }

return ans.toString();
        
    }
}