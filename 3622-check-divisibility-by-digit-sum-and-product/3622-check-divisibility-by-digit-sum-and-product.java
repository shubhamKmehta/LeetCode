class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0;
        int prod=1;
        int original = n;
        while(n != 0){
            int temp = n %10;
            sum += temp;
            prod *= temp;
            n /=10;
        }
        int temp =sum+prod;

        if( original % temp == 0)
        {return true;}
        
        return false;
    }
    
}