class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        for (int candy : candies) {
            sum += candy;
        }
        if (sum < k) return 0;
        
        long left = 1;
        long right = sum / k;
        int result = 0;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long total = 0;
            
            for (int candy : candies) {
                total += candy / mid;
                if (total >= k) break; // Early exit to optimize
            }
            
            if (total >= k) {
                result = (int) mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
}