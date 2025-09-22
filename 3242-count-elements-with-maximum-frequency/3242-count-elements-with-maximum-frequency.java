class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer>map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            map.put( num , map.getOrDefault(num , 0)+1);
        }

int c = 0;
        for(int val : map.values()){
            max = Math.max(val, max);
        }
        for(int key : map.values()){
                if(key == max){
                    c+=key;
                }
        }
      
      return c;        
    
    }
}