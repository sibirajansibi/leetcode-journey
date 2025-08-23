class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();

        for (char c : ch) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (!stack.isEmpty() && c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (!stack.isEmpty() && c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (!stack.isEmpty() && c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }

            }
        }
        return stack.isEmpty();

    }
}