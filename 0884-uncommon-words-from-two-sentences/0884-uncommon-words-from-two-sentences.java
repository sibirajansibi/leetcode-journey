class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
         
         
         
         HashMap<String , Integer> map = new HashMap<>();

       String[] vb = s1.split("\\s+");
       String[] vb2 = s2.split("\\s+");
     int count = 0;
     
        // [ this apple is sweet ]
     
       //[ (this , 1) ( apple,1) (is , 1) ( sweet ,1)] 
       for(String  s : vb){
          map.put( s , map.getOrDefault(s,0)+1);
       }  
         //[ this apple is sour]
       for(String s : vb2){
           if(map.containsKey(s)){
            map.put(s, map.get(s)+1);
        }else{
            map.put(s,1);
        }
       }  
      List<String>  list = new ArrayList<>();

       for(String key : map.keySet()){
            if(map.get(key) == 1){
              list.add(key);
            }
       }

       String[] ans = new String[list.size()];
     int index =0;
       for(String  s : list){
        ans[index++] = s;
       }


return ans;



    }
}