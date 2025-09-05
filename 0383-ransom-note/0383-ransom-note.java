class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     HashMap<Character , Integer> map = new HashMap<>(); //  b 
     for(char c : magazine.toCharArray()){
        map.put(c , map.getOrDefault(c , 0)+1);
     }
     for(char c : ransomNote.toCharArray()){ //a 
          if(!map.containsKey(c)|| map.get(c)<=0){  //b
            return false;
          }
          map.put(c , map.get(c)-1);
     }


        return true;
    }
}