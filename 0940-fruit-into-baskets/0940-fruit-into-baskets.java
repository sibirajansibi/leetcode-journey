class Solution {
    public int totalFruit(int[] fruits) {
        int ans = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
      
        for (int i = 0; i < fruits.length; i++) {
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);

            while (map.size() > 2 && left < fruits.length) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}