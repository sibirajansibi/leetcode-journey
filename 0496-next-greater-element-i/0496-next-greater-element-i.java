class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];

            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            int nge = stack.isEmpty() ? -1 : stack.peek();

            map.put(num, nge);

            stack.push(num);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;

    }
}