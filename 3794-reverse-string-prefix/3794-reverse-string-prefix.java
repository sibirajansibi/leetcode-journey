class Solution {
    public String reversePrefix(String s, int k) {
        

          String temp = s.substring(0 , k);
          String bal = s.substring(k);

          StringBuilder sb = new StringBuilder(temp);

          return sb.reverse().toString().concat(bal);




    }
}