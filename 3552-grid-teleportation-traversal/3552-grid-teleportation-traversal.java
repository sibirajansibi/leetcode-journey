
class Solution {
    static final int INF = Integer.MAX_VALUE / 2;

    public int minMoves(String[] str) {
        List<String> grid = new ArrayList<>();
        for(String s  : str){
            grid.add(s);
        }
        int m = grid.size();
        int n = grid.get(0).length();

      
        Map<Character, List<int[]>> portals = new HashMap<>();

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                char ch = grid.get(r).charAt(c);
                if (ch >= 'A' && ch <= 'Z') {
                    portals.computeIfAbsent(ch, k -> new ArrayList<>())
                           .add(new int[]{r, c});
                }
            }
        }

        int[][] dist = new int[m][n];
        for (int[] row : dist) Arrays.fill(row, INF);

        boolean[] used = new boolean[26];  

        Deque<int[]> dq = new ArrayDeque<>();

       
        dist[0][0] = 0;
        dq.add(new int[]{0, 0});

       
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!dq.isEmpty()) {
            int[] cur = dq.pollFirst();
            int r = cur[0], c = cur[1];
            int curDist = dist[r][c];

            
            if (r == m - 1 && c == n - 1) {
                return curDist;
            }

        
            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

            if (grid.get(nr).charAt(nc) == '#'){
                continue;
            }
                int newDist = curDist + 1;
                if (newDist < dist[nr][nc]) {
                    dist[nr][nc] = newDist;
                    dq.addLast(new int[]{nr, nc});  
                }
            }

            // Telport pananu with no cost 
            char ch = grid.get(r).charAt(c);
            if (ch >= 'A' && ch <= 'Z') {
                int id = ch - 'A';
                if (!used[id]) {
                    used[id] = true; 

                    for (int[] pos : portals.get(ch)) {
                        int tr = pos[0], tc = pos[1];

                        if (curDist < dist[tr][tc]) {
                            dist[tr][tc] = curDist;  
                            dq.addFirst(new int[]{tr, tc});
                        }
                    }
                }
            }
        }

        return -1;
    }
}
