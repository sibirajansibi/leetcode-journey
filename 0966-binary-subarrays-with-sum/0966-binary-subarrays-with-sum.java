class Solution {

    public int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

       int count = 0;
       int sum = 0;
        for(int right =0;right<nums.length;right++){
            sum+=nums[right];
         if(map.containsKey(sum-goal)){
              count+=map.get(sum-goal);
         }

         map.put(sum , map.getOrDefault(sum,0)+1);
         

        }
        return count;
    }
}