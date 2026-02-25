class Solution {
    public static void dfs(List<List<Integer>> rooms, int start, int[] vis){

        vis[start] = 1;
        for(int nei : rooms.get(start)){
            if(vis[nei] == 0){
                 dfs(rooms , nei , vis);
            }
        }

    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
      
      int[] vis = new int[rooms.size()];

    dfs(rooms , 0 , vis);

    for(int num : vis){
        if(num == 0){
            return false;
        }
    }

       return true; 
    }
}