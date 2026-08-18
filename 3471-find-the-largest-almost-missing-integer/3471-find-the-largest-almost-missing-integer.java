class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int ans = -1;
        
        if(k == 1){
            Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                ans = Math.max(ans,entry.getKey());
            }
        }
        return ans;
        }

        if(k == n){
            for(int num : nums) ans = Math.max(ans,num);
            return ans;
        }

        Set<Integer> set = new HashSet<>();
        for(int num : nums)set.add(num);

        int first = nums[0];
        if(countInSubarrays(nums,first,k) == 1){
            ans = Math.max(ans,first);
        }
        
        int last = nums[n-1];
        if(countInSubarrays(nums,last,k) == 1){
            ans = Math.max(ans,last);
        }

        return ans;
    }

    private int countInSubarrays(int[] nums,int x,int k){
        int n = nums.length;
        int count =0;

        for(int i=0;i<=n-k;i++){
            for(int j=i;j<i+k;j++){
                if(nums[j] == x){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}