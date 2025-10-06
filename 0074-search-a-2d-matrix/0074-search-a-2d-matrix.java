class Solution {
    public boolean searchMatrix(int[][] matrix, int target){

        int[] ans = new int[matrix.length * matrix[0].length];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans[index++] = matrix[i][j];
            }
        }
        if(isPresent(ans , target)){
            return true;
        }else{
            return false;
         }       
    }

    public static boolean isPresent(int [] arr , int k ){

        int left =0;
        int right = arr.length-1;

        while(left <= right){

            int mid = (left + right )/2;

            if(arr[mid] == k){
                return true;
            }else if(arr[mid] < k){
                left = mid+1;

            }else{
                right = mid-1;
            }
        }
        return false;

    }
  }