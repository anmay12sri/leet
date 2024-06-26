class Solution {
    public int minFallingPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];

        for(int j=0;j<n;j++){
            dp[0][j]=grid[0][j];
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=grid[i][j];
                int prev=Integer.MAX_VALUE;
                for(int k=0;k<n;k++){
                    if(k!=j){
                        prev=Math.min(prev,dp[i-1][k]);
                    }
                }
                dp[i][j]+=prev;

            }
        }
        int sum=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
         sum=Math.min(sum,dp[n-1][j]);
        }
       return sum;
    }
}