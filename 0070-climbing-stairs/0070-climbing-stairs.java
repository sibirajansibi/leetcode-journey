

class Solution {

    static int dp[];

    public static int climbStairs(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n);
    }

    private static int solve(int n) {

        if (n == 0 || n == 1)
            return 1;

        if (dp[n] != -1)
            return dp[n];

        dp[n] = solve(n - 1) + solve(n - 2);

        return dp[n];
    }
}