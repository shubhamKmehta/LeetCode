class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sorted = Arrays.copyOf(arr,n);
        Arrays.sort(sorted);
        int rank =1;
        Map<Integer,Integer>map = new HashMap<>();
        for(int num : sorted){
            if(!map.containsKey(num)){
                map.put(num,rank++);
            }
        }

        int[] ans = new int[n];

        for(int i=0;i< n;i++){
            ans[i] = map.get(arr[i]);
        }
        
        return ans;
    }
}