class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {  // tea 
            char[] ch = s.toCharArray();  
            Arrays.sort(ch); //aet 
            String v = new String(ch);  
            if (!map.containsKey(v)) { 
                map.put(v, new ArrayList<String>());
               // [eat]
                map.get(v).add(s); 
            }
            else{
                map.get(v).add(s);
            }
        }
return new ArrayList<>(map.values());
    }
}