class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;
        double max = Integer.MIN_VALUE;
        for(int i =0;i<k;i++){
            sum+=nums[i];
        }
        max = sum;
        for(int j =k;j<nums.length;j++){
            sum+=nums[j] - nums[j-k];
            max = Math.max(max,sum);

        }
        return max/k;


        
    }
}