class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0)+1);
        }

        int[] ans = new int[2];
        int k =0;
        for(int key : map.keySet()){
             if(map.get(key)==2){
                ans[k++] = key;
             }
        }

    return ans;

    }
}