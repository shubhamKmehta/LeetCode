class Solution {
    public int smallestIndex(int[] nums) {
        int minIndex = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(i == sumDigits(nums[i]) ){
                return minIndex = Math.min(minIndex,i);
            }
        }

        return -1;
    }

    private static int sumDigits(int num){
        int sum =0;
        while(num !=0){
            int temp = num%10;
            sum += temp;
            num /=10;

        }

        return sum;
    }
}