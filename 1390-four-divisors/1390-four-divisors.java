class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans =0;

        for(int i=0;i<nums.length;i++){
           ans += isTrue(nums[i] , nums);
        }
        return ans;
    }
    public static int isTrue(int n , int[]nums){

       int count = 0;
        int sum = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                int d1 = i;
                int d2 = n / i;

                if (d1 == d2) {     
                    count++;
                    sum += d1;
                } else {
                    count += 2;
                    sum += d1 + d2;
                }

                if (count > 4) return 0; 
            }
        }

        return count == 4 ? sum : 0;
    }
}