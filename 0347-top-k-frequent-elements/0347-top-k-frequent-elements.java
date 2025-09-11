class Solution {
    public int[] topKFrequent(int[] nums, int k){
        
    Map<Integer,Integer> map = new HashMap<>();
         for(int num : nums){
            map.put(num , map.getOrDefault(num ,0)+1);
         }
         
         List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
         list.sort((a,b)-> b.getValue()- a.getValue());
        

int v =0;
int [] ans = new int[k];
         for(Map.Entry<Integer,Integer>  pair : list){
            if(v == k){
                break;
            }
       
           ans[v++] = pair.getKey();
         }
return ans;
 
    }
}