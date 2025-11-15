class Solution {

    
    public int shortestBridge(int[][] grid) {

              int n = grid.length;
              int m = grid[0].length;
          
          boolean flag = false;
    int[][] Directions = { { 0, 1 }, { 0, -1 }, { -1, 0 }, { 1, 0 } };
      Queue<int[]> q = new LinkedList<>();
           for(int i =0;i<n && !flag;i++){
               for(int j = 0;j<m && !flag;j++){
                 if(grid[i][j] != 5&& grid[i][j] == 1){
                    dfs(grid , i , j, q);
                    flag = true;
                 }
            }
          }
          int count = 0;
          while(!q.isEmpty()){
            int size = q.size();
            for(int i =0;i<size;i++){
                int cell[] = q.poll();
                for(int [] dir : Directions){
                    int nR = cell[0]+ dir[0];
                    int nC = cell[1]+ dir[1];
                    
                     if(nR <0 || nC < 0|| nR >=n|| nC >=m){
                        continue;
                     }

                     if(grid[nR][nC]== 1 && grid[nR][nC]!=5){
                        return count;
                     }
                    if(grid[nR][nC]== 0 && grid[nR][nC]!=5){
                        grid[nR][nC] = 5;
                        q.offer(new int[]{nR, nC});
                    }
                }
            }
            count++;
          }       
          return count;
        
    }

    public static void dfs(int[][] grid , int i , int j, Queue<int[]> q){
        if(i<0||j<0||i>= grid.length||j>=grid[0].length||grid[i][j]==0||grid[i][j] == 5){
            return;
        }
        grid[i][j] = 5;
        q.offer(new int[]{i , j});
        dfs(grid , i+1, j , q);
        dfs(grid , i-1, j , q);
        dfs(grid , i, j+1 , q);
        dfs(grid , i, j-1 , q);
    }


        
}