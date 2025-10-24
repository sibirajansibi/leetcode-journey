class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split("\\s+");
        
        Arrays.sort(arr , (a, b)-> a.charAt(a.length()-1) - b.charAt(b.length()-1));
        for(int i=0;i<arr.length;i++){
            String v  = arr[i];
            arr[i] = v.substring(0, v.length()-1);
        }
        StringBuilder sb = new StringBuilder();
        for(String  sv : arr){
            sb.append(sv+" ");
        }

        return sb.toString().trim();
    }
}