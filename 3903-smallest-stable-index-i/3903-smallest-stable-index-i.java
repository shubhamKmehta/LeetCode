class Solution {
    public int firstStableIndex(int[] nums, int k) {
     int n = nums.length;
     int[] minElmentArray = new int[n];
     int minEl = Integer.MAX_VALUE;

     for(int i=n-1;i>=0;i--){
        minEl = Math.min(minEl,nums[i]);
        minElmentArray[i] = minEl;
     }
     int maxEl =0;

     for(int i=0;i<n;i++){
        maxEl = Math.max(maxEl,nums[i]);

        if(maxEl - minElmentArray[i] <= k){
            return i;
        }
     }

     return -1;
    }
}