class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean visited[] = new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                dfs(isConnected,i,visited);
                    count++;
                
            }
        }
        return count;
    }
    public void dfs(int[][] isConnected,int i, boolean[] visited){
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        visited[i]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int u=0;u<isConnected.length;u++){
                if(isConnected[node][u]==1 && !visited[u]){
                    visited[u]=true;
                    q.add(u);
                }
            }

        }
    }
}