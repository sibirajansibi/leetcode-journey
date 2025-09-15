class Solution {
    public int[] nextGreaterElements(int[] nums) {
               int[] ans = new int[nums.length*2];
                int n = nums.length;
            for(int i =0;i<ans.length;i++){
                ans[i] = nums[i%n];
            }
        for(int i = 0;i<nums.length;i++){
            int get = nums[i];
            ans[i] = isCheck(get,ans, i);
        }
        int k =0;
        
        for(int i =0;i<n;i++){
             nums[i] = ans[i];    
        }
 return nums;
        }
    

    public static int isCheck(int n , int[] ans, int start){

          for(int i= start;i<ans.length;i++){
            if(n<ans[i]){
                return ans[i];
            }
          }
          return -1;
    }
}