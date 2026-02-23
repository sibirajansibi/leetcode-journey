class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        while(!q.isEmpty()){
            int node = q.poll();
           if(node == end){
            return true;
           }
           for(int dir : adj.get(node)){
                 if(!visited[dir]){
                    visited[dir] = true;
                     q.offer(dir);
                 }
                
           }
        }
return false;
    }
}