class Solution {
    private static boolean[][] visited;   
    private static int[][] Directions = { { 0, 1 }, { 0, -1 }, { -1, 0 }, { 1, 0 } };
    public int countBattleships(char[][] board) {

        int n = board.length;
        int m = board[0].length;
        visited = new boolean[n][m];

        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && board[i][j] == 'X') {
                    bfs(board, i, j);
                    c++;
                }
            }
        }

        return c;
    }

    public void bfs(char[][]board , int i , int j ){
        int n = board.length;
        int m = board[0].length;

        visited[i][j] = true;

        Queue<int[]> q = new LinkedList<>();
        q.offer( new int[]{i , j });
        while(!q.isEmpty()){
            int cell[] = q.poll();

            for(int []dir : Directions){
                int nR = cell[0] + dir[0];
                int nC = cell[1] + dir[1];
               
               if(nR>=0 && nR<n && nC >=0 && nC< m && !visited[nR][nC]&& board[nR][nC] == 'X'){

visited[nR][nC] = true;
                q.offer(new int[]{nR , nC});
               }

            }



        }
    }
}