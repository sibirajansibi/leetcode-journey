class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        List<Map.Entry<String , Integer>> list  = new ArrayList<>(map.entrySet());
         list.sort((a, b) -> {
            if (b.getValue().equals(a.getValue())) {

                return a.getKey().compareTo(b.getKey());
            }
            // Otherwise, sort by frequency descending
            return b.getValue() - a.getValue();
        });

        List<String> ans = new ArrayList<>();

        for(Map.Entry<String , Integer> temp : list){
                if(k==0){
                    break;
                }
                k--;
                ans.add(temp.getKey());
                System.out.print(temp+" ");

        }
        
    //  Collections.sort(ans);

        return ans;
    }
}