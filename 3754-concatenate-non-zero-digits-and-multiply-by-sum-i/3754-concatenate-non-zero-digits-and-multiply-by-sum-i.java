class Solution {
    public long sumAndMultiply(int n) {
        long x =0;
        long sum =0;
        long p= 1;

        int temp=  n;
        while(temp  > 0){
            int digit = temp%10;

            if(digit !=0){
                x = x+ digit *p;
                sum += digit;
                p *= 10;
                
            }
            temp /= 10;

        }

        return x * sum;
    }
}