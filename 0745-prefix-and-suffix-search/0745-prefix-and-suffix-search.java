class WordFilter {
    private HashMap<String , Integer> map = new HashMap<>();
    public WordFilter(String[] words) {
      //  map = new HashMap<>();

        for(int index = 0; index < words.length;index++){
            String x = words[index];
            int len = x.length();
            for(int i =0 ; i <= len ;i++){
                String pref = x.substring(0,i);
                for(int j = 0; j <= len; j++){
                    String suff = x.substring(j);
                    map.put(pref+"#"+suff , index);
                }
            }
        }
    }
    
    public int f(String pref, String suff) {
         return map.getOrDefault(pref+"#"+suff,-1);
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(pref,suff);
 */