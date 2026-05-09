class Solution {
    public int trailingZeroes(int n) {
        return n / 3125 + n / 625 + n / 125 + n / 25 + n / 5;
    }
}