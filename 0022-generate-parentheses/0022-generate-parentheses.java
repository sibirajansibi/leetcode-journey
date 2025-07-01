class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solver(n , result , 0 , 0 ,  new StringBuilder());
        return result;
    }
    public static void solver(int n ,List<String> result , int open , int close , StringBuilder sb){
     if(sb.length() == 2*n){
         result.add(sb.toString());
         return;
     }

      if(open < n){
          sb.append('(');
          solver(n , result , open+1 , close , sb);
          sb.deleteCharAt(sb.length()-1);
      }
if(close < open){
          sb.append(')');
          solver(n , result , open , close+1 , sb);
          sb.deleteCharAt(sb.length()-1);
      }

    }



}