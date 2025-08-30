class Solution {
    public boolean partitionArray(int[] nums, int k) {

        if (nums.length % k != 0) {
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int size = nums.length/k;

        for(int num : map.values()){
            if(num>size){
                return false;
            }
        }
return true;
    }
}