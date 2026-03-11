class Solution {
    private static HashMap<Character, Integer> freqMap;
    public int minimumPushes(String word) {
        freqMap = new HashMap<>();
       
        for(char c : word.toCharArray()){
            freqMap.put(c , freqMap.getOrDefault(c, 0)+1);
        }
         List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(freqMap.entrySet());
        List<Character> res = new ArrayList<>();
           sortedList.sort((a, b) -> b.getValue() - a.getValue());
       for(Map.Entry<Character, Integer> pair : sortedList){
               res.add(pair.getKey());
       }
       int count  =1;
       int step =0;
       for(char c : res){
        if(count <= 8){ 
            step += freqMap.get(c) * 1;
            count++;
        }else if(count >8 && count <= 16){
            count++;
            step += freqMap.get(c) *2;
        }else if(count >16 && count<= 24){
             step += freqMap.get(c) * 3;
            count++;
        }else{
              step += freqMap.get(c) * 4;
            count++;
        }
       }
  
     return step;
    }
}