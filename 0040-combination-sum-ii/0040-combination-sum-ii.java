class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        solver(0 , target ,  nums , result , new ArrayList<>());
        return result;
    }

    public static void solver(int start, int target, int[] nums, List<List<Integer>> result, List<Integer> current){
       
     if(target == 0){
          result.add(new ArrayList<>(current));
         return;
     }
        

            
        for(int i = start; i<nums.length;i++){
            if(start<i&& nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i]>target){
                break;
            }
            current.add(nums[i]);
            solver(i+1, target - nums[i] , nums , result , current);
            current.remove(current.size()-1);
        }
 
  
    }

}
