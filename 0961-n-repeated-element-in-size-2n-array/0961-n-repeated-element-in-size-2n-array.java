class Solution {
    public int repeatedNTimes(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int num : nums){
            map.put(num , map.getOrDefault(num , 0)+1);
         }
         int n = (nums.length/2);
         int ans = 0;
         for(int key : map.keySet()){
           if(map.get(key)== n){
            ans = key;
           }
         }
     return ans;
    }
}