class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int max=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
    public int dfs(int grid[][], int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        int count=1;
        
        grid[i][j]=0;

       count+= dfs(grid,i,j-1);
        count+=dfs(grid,i,j+1);
        count+=dfs(grid,i-1,j);
        count+=dfs(grid,i+1,j);

        return count;
    }
}