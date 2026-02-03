class Solution {
    public int countPrimes(int n) {
        if(n == 0|| n== 1|| n== 2){
            return 0;
        }
        boolean [] flag = new boolean[n+1];
         
        for(int i =0;i<n;i++){
            flag[i] = true;
        }

        for(int i = 2; i * i <n; i++){
                if(flag[i]){
                    for(int j = i*i; j < n; j+= i){
                         flag[j] = false;
                    }
                }
        }
    int count  =0;
    for(int i = 2;i<flag.length;i++){
        if(flag[i]){
            count++;
        }
    }
        return count;
    }
}