class Solution {
    public String reverseOnlyLetters(String s) {

    int s1 = 0;
    int end = s.length()-1;
    char[] ch = s.toCharArray();

    while(s1 < end){
     while( s1 < end && !Character.isLetter(ch[s1])){
        s1++;
     }
     while(s1 < end && !Character.isLetter(ch[end])){
        end--;
    }    
    char temp = ch[s1];
    ch[s1] = ch[end];
    ch[end] =  temp;
    s1++;
    end--;
    }

    return new String(ch);
}
}