class Solution {
    public boolean canJump(int[] nums) {


int max  =0;
for(int i =0;i<nums.length;i++){ // i =0; i = 1
    if(i> max){    
        return false; 
    }
    //           (0 , 0+2)( 1, 3+1)
    max = Math.max(max , nums[i]+i);
}

return true;
        
    }
}