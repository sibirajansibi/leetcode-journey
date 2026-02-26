class Solution {
    private char[][] marking;
    private boolean[][] visited;
        private boolean[][] visit;
        private int count;
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        visited = new boolean[n][m];
         visit = new boolean[n][m];
        marking  = new char[n][m];
        count = 0;
        for(int i =0;i < n;i++){
            for(int j = 0;j< m;j++){
                marking[i][j] = '#';
            }
        }

        for(int i =0;i < n;i++){
            for(int j = 0;j < m;j++){
                if((i == 0|| j == 0|| i == n-1 || j == m-1) && grid[i][j] == 1){
                    BoundDfs(i , j, grid);
                }
            }
        }
             // Java example
             for(int i =0;i < n;i++){
            for(int j = 0;j< m;j++){
               System.out.print(marking[i][j]+" ");
            }
            System.out.println();
        }
        int count =0;
        for(int i =0;i < n;i++){
            for(int j =0;j < m;j++){
               if( grid[i][j] == 1 && marking[i][j] !='*'){
                   count++;
               }
            }
        }


        return count;
    }
    public void BoundDfs(int i , int j ,int[][] grid){
        if(i < 0 || j < 0 || i>= grid.length || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]){
            return;
        }
        visited[i][j] = true;
        marking[i][j] = '*';
        BoundDfs(i+1, j, grid);
        BoundDfs(i ,  j+1, grid);
        BoundDfs(i-1, j, grid);
        BoundDfs(i,   j-1, grid);
    }


    // public void sadhaDfs(int i , int j , int[][] grid){
    //       if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || visit[i][j] || marking[i][j] == '*'){
    //         return;
    //     }
    //     visit[i][j] = true;
    //     if(grid[i][j] == 1){
    //         count++;
    //     }
      
    //     sadhaDfs(i+1 , j , grid);
    //     sadhaDfs(i , j+1 , grid);
    //     sadhaDfs(i-1 , j , grid);
    //     sadhaDfs(i , j-1 , grid);
    // }







}