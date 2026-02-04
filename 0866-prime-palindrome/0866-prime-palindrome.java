class Solution {
    public int primePalindrome(int n) {

        if (n <= 2) return 2;
        if (n <= 3) return 3;
        if (n <= 5) return 5;
        if (n <= 7) return 7;
        if (n <= 11) return 11;

        for (int i = 1; i < 100000; i++) {
            int pal = makePalindrome(i);
            if (pal >= n && isPrime(pal)) {
                return pal;
            }
        }
        return -1;
    }

    private int makePalindrome(int x) {
        int res = x;
        x /= 10;
        while (x > 0) {
            res = res * 10 + (x % 10);
            x /= 10;
        }
        return res;
    }

    private boolean isPrime(int x) {
        if (x < 2) return false;
        if (x % 2 == 0) return x == 2;
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
