class Solution {
    public long zeroFilledSubarray(int[] nums) {


       
    long ans = 0, streak = 0;
    for (int n : nums) {
        if (n == 0) {
            streak++;
        }
        else{ 
            streak = 0;
        }
        ans += streak;
    }
    return ans;

    }
}