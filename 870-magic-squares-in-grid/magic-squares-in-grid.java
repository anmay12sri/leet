class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;

        for(int i=0;i<m-2;i++){
            for(int j=0;j<n-2;j++){
                if(check(grid,i,j)){
                    count++;
                }
            }
        }
    return count;
    }
    public boolean check(int grid[][],int i,int j){
        if(grid[i+1][j+1]!=5)return false;
        boolean seen[]=new boolean[10];//number between 1 to 9
        int sum[]=new int[8]; // 3 row 3 col 2 diagonal

        for(int x=0;x<3;x++){
           for(int y=0;y<3;y++){
            int num=grid[x+i][y+j];
            if(num<1||num>9||seen[num]){
                return false;
            }
            seen[num]=true;

            sum[x]+=num;
            sum[3+y]+=num;
           }
           sum[6]=grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2];
           sum[7]=grid[i+2][j]+grid[i+1][j+1]+grid[i][j+2];
        }
        for(int k:sum){
            if(k!=15)return false;
        }
        return true;
    }
}