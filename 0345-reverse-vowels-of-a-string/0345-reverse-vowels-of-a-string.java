class Solution {
    public String reverseVowels(String s) {
     char[]ch = s.toCharArray();
     int s1 = 0;
     int end = ch.length-1;
     String vow = "aeiouAEIOU";
     while(s1<end){
     while(s1<end && vow.indexOf(ch[s1])==-1){
        s1++;
     }  
     while(s1<end && vow.indexOf(ch[end])==-1){
        end--;
     }
     char tp = ch[s1];
     ch[s1]= ch[end];
     ch[end]= tp;
s1++;
end--;
     }
     String answer = new String(ch);
     return answer;
    }
}