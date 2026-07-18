class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallestNum = nums[0];
        int largestNum = nums[nums.length-1];
        return gcd(smallestNum,largestNum);

    }

    private int gcd(int a,int b){
       while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}