class Solution {
    public int longestValidParentheses(String s) {
        int l = 0;
        int r = 0;
        int max = 0;
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (c == '(') {
                l++;
            } else {
                r++;
            }
            if (l == r) {
                max = Math.max(max, l * 2);
            }

            if(r>l){
                l=0;
                r =0;
            }
        }
    l =0;
    r =0;
    for(int i =ch.length-1;i>=0;i--){
        if(ch[i]=='('){
            l++;
        }else{
            r++;
        }
    if(l==r){
        max = Math.max(max, l*2);
    }
    if(l>r){
        l= 0;
        r =0;
    }
    }
    return max;




    }
}