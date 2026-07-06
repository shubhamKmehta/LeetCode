class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals,(a, b) ->
            a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]
        );

        result.add(intervals[0]);

        for(int i=0;i<n;i++){
            int[] last = result.get(result.size()-1);
            if(last[0] <= intervals[i][0] && last[1] >= intervals[i][1]){
                continue;
            }
            result.add(intervals[i]);
        }
        
        return result.size();


    }
}