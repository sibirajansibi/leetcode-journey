class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map = new HashMap<>();

        int k = 10;
        for (int i = 0; i <= s.length() - k; i++) {
            String v = s.substring(i, i + k);
            map.put(v , map.getOrDefault(v,0)+1);
        }
int max =0;
List<String> list = new ArrayList<>();
      for(String key : map.keySet()){
        if(map.get(key)>1){
            list.add(key);
        }
      }
        return list;

    }
}