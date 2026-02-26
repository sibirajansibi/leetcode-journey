class Solution {
 
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
      
       int count = 0;
       for(int i = 0;i<n;i++){
            BoundDfs(i , 0, grid);
             BoundDfs(i , m-1, grid);
       }
       for(int i = 0;i<m;i++){
            BoundDfs(0, i, grid);
             BoundDfs(0 , n-1, grid);
       }

     // Java example
    
        for(int i =0;i < n;i++){
            for(int j =0;j < m;j++){
               if( grid[i][j] == 1){
                   count++;
               }
            }
        }


        return count;
    }
    public void BoundDfs(int i , int j ,int[][] grid){
        if(i < 0 || j < 0 || i>= grid.length || j >= grid[0].length || grid[i][j] == 0){
            return;
        }
        grid[i][j] = 0;
        BoundDfs(i+1, j, grid);
        BoundDfs(i ,  j+1, grid);
        BoundDfs(i-1, j, grid);
        BoundDfs(i,   j-1, grid);
    }
}