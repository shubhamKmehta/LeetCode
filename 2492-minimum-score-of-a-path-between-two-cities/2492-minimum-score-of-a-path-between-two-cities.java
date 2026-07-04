class Solution {
    List<int[]>[] graph;
    boolean[] visited;
    int ans = Integer.MAX_VALUE;

    public int minScore(int n, int[][] roads) {
        graph = new List[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();

        for (int[] road : roads) {
            graph[road[0]].add(new int[]{road[1], road[2]});
            graph[road[1]].add(new int[]{road[0], road[2]});
        }

        dfs(1);
        return ans;
    }

    private void dfs(int node) {
        visited[node] = true;
        for (int[] next : graph[node]) {
            ans = Math.min(ans, next[1]); // edge weight track karo
            if (!visited[next[0]]) {
                dfs(next[0]);
            }
        }
    }
}