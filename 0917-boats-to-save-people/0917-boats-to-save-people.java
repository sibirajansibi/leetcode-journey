class Solution {
    public int numRescueBoats(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int boat = 0;
        while (i <= j) {
            if (nums[i] + nums[j] <= k) {
                i++;
            }
            j--;
            boat++;
        }
        return boat;
    }
}