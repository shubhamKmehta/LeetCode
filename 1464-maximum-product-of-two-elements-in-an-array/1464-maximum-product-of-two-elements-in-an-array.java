class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

        int n = nums.length;
        Arrays.sort(nums);
        int prod = (nums[n-1]-1)*(nums[n-2]-1);
        return prod;

    }
}