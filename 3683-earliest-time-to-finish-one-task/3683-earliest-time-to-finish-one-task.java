class Solution {
    public int earliestTime(int[][] tasks) {
        int earliest = Integer.MAX_VALUE;

        for (int i = 0; i < tasks.length; i++) {
            int start = tasks[i][0];
            int duration = tasks[i][1];
            int finishTime = start + duration;

            if (finishTime < earliest) {
                earliest = finishTime;
            }
        }

        return earliest;
    }
}