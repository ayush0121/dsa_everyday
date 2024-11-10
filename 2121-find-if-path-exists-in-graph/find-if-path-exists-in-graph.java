class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[n];
        q.offer(source);
        visited[source]=true;
        while(!q.isEmpty()){
            int current=q.poll();
            if(current==destination){
                return true;
            }
            for(int neig:adj.get(current)){
                if(!visited[neig]){
                    visited[neig]=true;
                    q.offer(neig);
                }
            }
        }
        return false;
        
    }
}