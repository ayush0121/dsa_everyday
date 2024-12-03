class Solution {
    public void dfs(int[][] grid,int i,int j){
        if(i<0 || j<0 ||i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return;
        }
        grid[i][j]=0;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(i==0 || j==0 || i==n-1  || j==m-1 ){
                        dfs(grid,i,j);
                    }
                }
            }
        }
        int total=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    total++;
                }
            }
        }
        return total;
    }
}