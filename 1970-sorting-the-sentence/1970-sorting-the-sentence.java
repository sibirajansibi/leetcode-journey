class Solution {
    public String sortSentence(String s) {
        TreeMap<Integer,String> map = new TreeMap<>();
StringBuilder sb = new StringBuilder();
        String[] srr = s.split("\\s+");
        for(int i =0;i<srr.length;i++){
            String v = srr[i];
            int key = (int) (v.charAt(v.length()-1));
               v = v.substring(0,v.length()-1);
            map.put(key,v);
        }
        System.out.print(map);

        for(String  ss : map.values()){
sb.append(ss+" ");
        }
        return sb.toString().trim();
    }
}