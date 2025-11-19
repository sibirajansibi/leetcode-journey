class Solution {
    public int findFinalValue(int[] nums, int original) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
           int k = 0;
        while(set.contains(original)) {
    		original *= 2;
    	}
        return original;
    }
}