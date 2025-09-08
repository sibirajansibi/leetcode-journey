class Solution {
    public int[] sumZero(int n) {
         int[] res = new int[n];
      int k =0;

      for(int i = 1;i<=n/2;i++){
        res[k++] = i;
        res[k++] = -i;
      }

      if(n%2!=0){
        res[k++] = 0;
      }
    return res;
}
}