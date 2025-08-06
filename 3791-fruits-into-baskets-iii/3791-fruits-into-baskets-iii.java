class Solution {
    private int[] segTree;
    private int m;

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        m = baskets.length;
        segTree = new int[4 * m];
        build(baskets, 0, m - 1, 1);

        int unplaced = 0;
        for (int fruit : fruits) {
            int res = placeFruit(fruit, 0, m - 1, 1);
            if (res == -1) unplaced++;
        }
        return unplaced;
    }

    private void build(int[] arr, int l, int r, int idx) {
        if (l == r) {
            segTree[idx] = arr[l];
            return;
        }
        int mid = (l + r) / 2;
        build(arr, l, mid, idx * 2);
        build(arr, mid + 1, r, idx * 2 + 1);
        segTree[idx] = Math.max(segTree[idx * 2], segTree[idx * 2 + 1]);
    }

    // Place fruit and mark the basket as used (-1)
    private int placeFruit(int fruit, int l, int r, int idx) {
        if (segTree[idx] < fruit) return -1;
        if (l == r) {
            segTree[idx] = -1; // mark as used
            return l;
        }
        int mid = (l + r) / 2;
        int res = -1;
        if (segTree[idx * 2] >= fruit) {
            res = placeFruit(fruit, l, mid, idx * 2);
        } else {
            res = placeFruit(fruit, mid + 1, r, idx * 2 + 1);
        }
        segTree[idx] = Math.max(segTree[idx * 2], segTree[idx * 2 + 1]);
        return res;
    }
}
