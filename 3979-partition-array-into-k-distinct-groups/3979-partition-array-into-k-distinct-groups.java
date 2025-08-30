import java.util.*;

class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;
        
        // If array length is not divisible by k, partition impossible
        if (n % k != 0) return false;
        
        int size = n / k;
        
        // Sort the numbers to group them easily
        Arrays.sort(nums);

        int count = 1; // count frequency of current number
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count > size) return false; // same number too frequent
            } else {
                count = 1; // reset when number changes
            }
        }
        return true;
    }
}
