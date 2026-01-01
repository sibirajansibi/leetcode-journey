class Solution {
    public int alternateDigitSum(int cpy) {
        int sum = 0;
        int   n = 0;
        while(cpy !=0){
            int digit = cpy%10;
            n = n*10+digit;
            cpy /=10;
        }

        System.out.print(n);

        int f =0;
        while(n!=0){
            
            int digit = n%10;
            if(f ==0){
                sum += digit; 
                f = 1;
            }else{
                sum -= digit;
                f =0;
            }
            n/=10;
        }

        return sum;
    }
}

