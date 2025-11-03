
class TweetCounts {
    private Map<String, List<Integer>> tweetTimeMap;

    public TweetCounts() {
        tweetTimeMap = new HashMap<>();
    }
 public void  recordTweet(String tweetName, int time) {
        tweetTimeMap.putIfAbsent(tweetName, new ArrayList<>());
        tweetTimeMap.get(tweetName).add(time);
    }

    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        int inv;
        if (freq.equals("minute")) {
            inv = 60;
        } else if (freq.equals("hour")) {
            inv = 60 * 60;
        } else { 

            inv = 60 * 60 * 24;
        }

        List<Integer> result = new ArrayList<>();
        List<Integer> times = tweetTimeMap.getOrDefault(tweetName, new ArrayList<>());
        Collections.sort(times);

        int n = ((endTime - startTime) / inv) + 1;
        for (int i = 0; i < n; i++) {
            result.add(0);
        }
        for (int time : times) {
            if (time >= startTime && time <= endTime) {
                int idx = (time - startTime) / inv;
                result.set(idx, result.get(idx) + 1);
            }
        }
        return result;
    }
}
