class Solution {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int n = digits.length;
        int maxNum = num;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(digits, i, j);
                int newNum = Integer.parseInt(new String(digits));
                maxNum = Math.max(maxNum, newNum);
                swap(digits, i, j);
            }
        }
        return maxNum;
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
