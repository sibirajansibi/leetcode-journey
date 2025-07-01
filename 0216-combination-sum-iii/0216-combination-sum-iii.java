class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        solver(k, n, result, new ArrayList<>(), 1, 0);
        return result;
    }

    public static void solver(int k, int n, List<List<Integer>> result, List<Integer> current, int start, int sum) {
        if (current.size() == k && sum == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < 10; i++) {
            if (sum + i > n) {
                break;
            }
            current.add(i);
            solver(k, n, result, current, i + 1, sum + i);
            current.remove(current.size() - 1);
        }

    }

}