class Solution {
    public int splitArray(int[] nums, int k) {
        int max = 0;
        int right = 0;
        for (int num : nums) {
            max = Math.max(num, max);
            right += num;
        }
        int left = max;
        int ans = 0;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (isVal(mid, nums, k)){
                ans = mid;
             right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isVal(int mid, int[] nums, int k) {

        int partition = 1;
    
    int sum =0;
        for(int num : nums){
            if(sum + num > mid){
                 partition ++;
                sum = num;
            }else{
                sum+=num;
            }
        }

        return partition<=k;
    }                                 

}