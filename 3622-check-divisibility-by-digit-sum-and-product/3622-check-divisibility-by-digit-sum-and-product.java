class Solution {
    public boolean checkDivisibility(int n) {
        
        if( n % sumAndPro(n) == 0)
            return true;
        
        return false;
    }
    private int sumAndPro(int n){
        int sum =0;
        int prod=1;

        while(n >0){
            int temp = n %10;
            sum += temp;
            prod *= temp;
            n /=10;
        }
        return sum+prod;
    }
}