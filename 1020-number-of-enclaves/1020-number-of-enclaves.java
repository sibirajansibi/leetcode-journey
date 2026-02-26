class Solution {

    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 || j == 0 || i == n - 1 || j == m - 1) && grid[i][j] == 1) {
                    BoundDfs(i, j, grid);
                }
            }
        }
        // Java example
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    public void BoundDfs(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return;
        }
     grid[i][j] = 0;
        BoundDfs(i + 1, j, grid);
        BoundDfs(i, j + 1, grid);
        BoundDfs(i - 1, j, grid);
        BoundDfs(i, j - 1, grid);
    }
}