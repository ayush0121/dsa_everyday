class Solution {
    static void isComplete(int node, List<List<Integer>> adj, int vis[], int cnt[]) {
        vis[node] = 1;
        cnt[0]++;

        for(Integer it : adj.get(node)) {
            cnt[1]++;
            if(vis[it] == 0) {
                isComplete(it, adj, vis, cnt);
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        int vis[] = new int[n];

        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(vis[i] == 0) {
                int cnts[] = new int[2];
                isComplete(i, adj, vis, cnts);
                int edge = (cnts[0] * (cnts[0]-1)) / 2;
                if(edge == cnts[1]/2) cnt++;
            } 
        }

        return cnt;
    }
}