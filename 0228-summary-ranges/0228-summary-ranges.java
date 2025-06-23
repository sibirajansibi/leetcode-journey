class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            int start = nums[i];
            int flag = 0;
            while(i<nums.length-1&&nums[i]+1==nums[i+1]){
                i++;
                flag = 1;

            }
            if(flag==1){
                list.add(start+"->"+nums[i]);
            }else{
                list.add(String.valueOf(start));
            }
        }
        return list ;
    }
}