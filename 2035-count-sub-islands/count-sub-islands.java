class Solution {
    int m;
    int n;
    boolean subisland;
    
   public void dfs(int grid1[][],int grid2[][],int i,int j){
    if(i<0 || i==m || j<0 || j==n || grid2[i][j]==0)return;

    if(grid1[i][j]!=grid2[i][j]){
        subisland=false;
    }
    grid2[i][j]=0;

    dfs(grid1,grid2,i+1,j);
    dfs(grid1,grid2,i-1,j);
    dfs(grid1,grid2,i,j+1);
    dfs(grid1,grid2,i,j-1);
   }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
         m=grid1.length;
         n=grid1[0].length;
         

        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid2[i][j]==1){
                    subisland=true;
                    dfs(grid1,grid2,i,j);
                    if(subisland){
                        count++;
                    }
                }
            }
        }
        return count;

    }
}