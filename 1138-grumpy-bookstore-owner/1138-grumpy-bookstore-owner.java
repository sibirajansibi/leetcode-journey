class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int x) {

        int sum = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }

        for (int i = 0; i < x; i++) {
            if (grumpy[i] == 1) {
                sum+= customers[i];
            }
        }
          int maxExtra = 0;

        int extra = 0;
        for (int i = x; i < customers.length; i++) {
 ///// remove from the left
            if (grumpy[i - x] == 1) {
                extra -= customers[i - x];
            }
            //add in the right;

            if (grumpy[i] == 1) {
                extra += customers[i];
            }

            maxExtra = Math.max(maxExtra, extra);
        }
        return sum + maxExtra;

    }
}