class Solution {
    private static List<List<Integer>> result;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        result = new ArrayList<>();

        solver(0 , graph.length-1, graph , new ArrayList<>());
        return result;
    }
    public static void solver(int start , int target , int[][] graph , List<Integer>current){

    current.add(start);
        if(start == target){
            result.add(new ArrayList<>(current));
        }
       else{
            for(int nei : graph[start]){
                 solver(nei , graph.length-1, graph ,current);
            }
       }
 current.remove(current.size()-1);
    }
}