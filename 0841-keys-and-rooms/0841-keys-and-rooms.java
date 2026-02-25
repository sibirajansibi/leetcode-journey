class Solution {
    private boolean flag;
    private boolean[] visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        List<Integer> list = rooms.get(0);
        visited = new boolean[rooms.size()];
        visited[0] = true;
          for(int nei : list){   // [ 1 , 3]
             solver(nei, rooms, visited);  // ( 1, r ,v)
          }
          System.out.print(Arrays.toString(visited));

          for(int i =0;i< visited.length;i++){
            if(!visited[i]){
                 return false;
            }
          }
          
         
        return true;
    }
    public static void solver(int start, List<List<Integer>> rooms, boolean[]visited){
                 
                 visited[start] = true;
               for(int nei : rooms.get(start)){   // 1->[3, 0 , 1] 3 -> []
                if(!visited[nei]){ // 3
                   
                     solver(nei, rooms, visited);
                }
               }

    }
   
}