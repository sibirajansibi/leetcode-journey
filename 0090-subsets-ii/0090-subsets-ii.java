class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        solver(0, nums, result, new ArrayList<>());
        return result;
    }

    public static void solver(int start, int[] nums, List<List<Integer>> result, List<Integer> current) {
        result.add(new ArrayList<>(current));

        if (start == nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (start < i && nums[i] == nums[i - 1]) {
                continue;
            }
            current.add(nums[i]);
            solver(i + 1, nums, result, current);
            current.remove(current.size() - 1);
        }
    }
}