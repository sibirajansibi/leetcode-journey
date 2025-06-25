class Solution {
    public String kthDistinct(String[] arr, int v) {

        HashMap<String, Integer> map = new LinkedHashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0 )+1);
        }
        int c = 0;
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                c++;
                if (c == v) {
                    return key;
                }
            }
        }
        return "";
    }
}