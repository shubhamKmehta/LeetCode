class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE; // sabse bada
        int max2 = Integer.MIN_VALUE; // doosra bada
        int max3 = Integer.MIN_VALUE; // teesra bada

        // Top 2 minimums
        int min1 = Integer.MAX_VALUE; // sabse chota
        int min2 = Integer.MAX_VALUE; // doosra chota

        for (int num : nums) {
            // Max update
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            // Min update
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // Case 1 vs Case 2
        return Math.max(max1 * max2 * max3, max1 * min1 * min2);
    }
}