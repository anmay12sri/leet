class Solution {
    public int[][] largestLocal(int[][] grid) {
        int maxlocal[][]=new int[grid.length-2][grid.length-2];

        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid.length-2;j++){
                maxlocal[i][j]=find(grid,i,j);
            }
        }
        return maxlocal;
    }
    public int find(int grid[][],int x,int y){
        int maxEle=0;
        for(int i=x;i<x+3;i++){
            for(int j=y;j<y+3;j++){
               maxEle=Math.max(maxEle,grid[i][j]);
            }
        }
        return maxEle;
    }
}