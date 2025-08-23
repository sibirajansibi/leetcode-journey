class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> Hash = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            Hash.put(c, Hash.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!Hash.containsKey(c) || Hash.get(c) <= 0) {
                return false;
            }
            Hash.put(c,Hash.get(c) - 1);
        }

        return true;
    }
}