class Solution {
    private static ArrayList<ArrayList<Integer>> adj;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        adj = new ArrayList<>();
        for(int i =0; i <numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] edge : prerequisites){
            adj.get(edge[1]).add(edge[0]);
        }
        int[] grid = new int[numCourses];


         for(int i =0;i<numCourses;i++){
            if(grid[i] == 0){
                // visit aagala
                if(dfs(i , grid)){
                    return false;
                }

         }
    }
    return true;
}
           public static boolean dfs(int node , int[] grid){
            grid[node] = 1; // current node; like visiting

            for(int nei : adj.get(node)){
                if(grid[nei] == 1){
                     return true;
                }
                if(grid[nei] == 0){
                    if(dfs(nei , grid)){
                      return true;
                    }

                }
            }
            grid[node] = 2; //-> node visit
            return false;

           }
}
