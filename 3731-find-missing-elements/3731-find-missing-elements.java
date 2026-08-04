class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer> list1 = new ArrayList<>();
        int max= nums[0];
        int min = nums[0];
        for(int n : nums){
            max = Math.max(max,n);
            min = Math.min(min,n);
        }
        int[] arr = new int[max+1];
        for(int n: nums){
            arr[n]++;
        }

        for(int i=min;i<max;i++){
            if(arr[i]==0) 
                list1.add(i);
        }
        
        return list1;
    }
}