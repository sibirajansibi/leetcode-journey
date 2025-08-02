

public class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long res = 0;
      
        for (int i = 0; i < n / 3; i++) {
            res += nums[n - 2 - 2 * i];
        }
        return res;
    }
}