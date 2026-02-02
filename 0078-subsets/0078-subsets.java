class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result =  new ArrayList<>();
    solver(0 , nums , result , new ArrayList<>());
    return result;
    }
    public static void solver(int start , int[] nums ,  List<List<Integer>> result, List<Integer>current ){
            result.add(new ArrayList<>(current));
 if(current.size()==nums.length){
return;
 }

        for(int i =  start;i<nums.length;i++){
            current.add(nums[i]);
            solver(i+1 , nums , result , current);
            current.remove(current.size()-1);
        }
    }
}