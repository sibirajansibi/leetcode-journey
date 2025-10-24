class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr, (a, b) -> a.charAt(a.length() - 1) - b.charAt(b.length() - 1));
        for (int i = 0; i < arr.length; i++) {
            String v = arr[i];
            sb.append(arr[i] = v.substring(0, v.length()-1)+" ");
        }
        return sb.toString().trim();
    }
}