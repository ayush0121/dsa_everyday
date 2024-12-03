class Solution {
    static boolean visited[][];
    public int maxAreaOfIsland(int[][] grid) {
        int count=0;
        int row=grid.length;
        int col=grid[0].length;
        visited=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    
                    count=Math.max(count,dfs(grid,i,j));
                    
                }
            }
        }
        return count;
        
        
    }


    public static int dfs(int[][] grid,int x, int y){
        int row=grid.length;
        int col=grid[0].length;
        if(x<0 || y<0 || x>=row|| y>=col ||grid[x][y]==0|| visited[x][y]){
            return 0 ;
        }
        int count=1;
        visited[x][y]=true;
        count+=dfs(grid,x+1,y);
        count+=dfs(grid,x,y+1);
        count+=dfs(grid,x-1,y);
        count+=dfs(grid,x,y-1);
        return count;
    }
}