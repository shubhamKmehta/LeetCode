class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        
        int[] prefixGCD = new int[n];
        int max =0;
        for(int i=0;i<n;i++){
            max = Math.max(nums[i],max);
            prefixGCD[i] = gcd(nums[i],max);
        }
        Arrays.sort(prefixGCD);  // [2,2,6]

        long ans = 0;

        // Pair smallest with largest
        for (int i = 0; i < n / 2; i++) {
            ans += gcd(prefixGCD[i], prefixGCD[n - 1 - i]);
        }

        return ans;
    }

    private int gcd(int a,int b){
        while(b !=0){
            int rem = a % b;
            a = b;
            b =rem;
        }
        return a;
    }
}