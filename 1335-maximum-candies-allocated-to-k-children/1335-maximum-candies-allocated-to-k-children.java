class Solution {
    public int maximumCandies(int[] arr, long k) {
        int max = 0;
        int left = 1;
        for (int i : arr) {
            max = Math.max(i, max);
        }

        int right = max;
        int low = 1;
        int ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (isVal(mid, k, arr)) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isVal(int mid, long k, int[] arr) {

        long sum = 0;
        for (int num : arr) {
            sum += num / mid;
        }
        return sum >= k;

    }

}