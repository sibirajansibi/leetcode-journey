class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
      

          int n = fruits.length;
      boolean[] bool = new boolean[n];
      int unplace = 0;
       for(int i =0;i<n;i++){
        boolean placed = false;
        for(int j =0;j<n;j++){
            if(!bool[j] && fruits[i]<=baskets[j]){
                bool[j] = true;
                placed = true;
                break;
            }
        }
        if(!placed){
            unplace++;
        }
       }

       return unplace;
      

    }
}