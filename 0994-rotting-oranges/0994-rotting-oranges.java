class Solution {
    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int time = 0;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j, 0 });
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0) {
            return 0;
        }
        int[][] Directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int t = cell[2];
            for (int[] dir : Directions) {
                int nR = cell[0] + dir[0];
                int nC = cell[1] + dir[1];
                if (nR < n && nR >= 0 && nC < m && nC >= 0 && grid[nR][nC] == 1) {
                    grid[nR][nC] = 2;
                    fresh--;
                    q.offer(new int[] { nR, nC, t + 1 });
                    if (fresh == 0) {
                        return t + 1;
                    }
                }
            }
        }

        return -1;

    }
}