class Solution {

    private static final Map<Character, String> phoneMap = new HashMap<>();

    static {
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");
    }

    public List<String> letterCombinations(String s) {
        if (s.length() == 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        solver(0, s, result, new StringBuilder());
        return result;
    }

    public static void solver(int start, String s, List<String> result, StringBuilder sb) {
        if (start == s.length()) {
            result.add(sb.toString());
            return;
        }
        String possible = phoneMap.get(s.charAt(start)); 
        for (char c : possible.toCharArray()) {
            sb.append(c);//a 
            solver(start + 1, s, result, sb);// 
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}