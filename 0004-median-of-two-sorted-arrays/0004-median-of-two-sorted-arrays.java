class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
         int m = nums2.length;
         int[]merged = new int[n+m];
         int v =0;
         for(int i=0;i<n;i++){
          merged[v++]=nums1[i];
         }

         for(int i=0;i<m;i++){
         merged[v++]=nums2[i];
         }
         Arrays.sort(merged);

         int tt =  merged.length;
         if(tt%2!=0){
return (double)merged[tt/2];
         }else{
            double mid = (double)merged[(tt/2)-1];
            double mid2 = (double)merged[tt/2];
            return (double) ((mid+mid2)/2.0);
         }


    }
}