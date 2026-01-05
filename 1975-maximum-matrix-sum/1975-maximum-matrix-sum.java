class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int minAbs=Integer.MAX_VALUE, negOdd=0;
        for (int [] row: matrix){
            for(int x: row){
                minAbs=Math.min(minAbs, Math.abs(x));
                if (x<0){
                    sum-=x;
                    negOdd=1-negOdd;
                }
                else sum+=x;
            }
        }
        return sum-2*negOdd*minAbs;
    }
}