class Solution {
    public int numSquares(int n) {
       int dp[]=new int[n+1];
       Arrays.fill(dp,-1);
       return f(n,dp);
    }

    public int f(int n,int dp[]){
        if(n<4) return n;
         
        if(dp[n]!=-1)return dp[n];
         int res=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
           res=Math.min(res, 1+f(n-(i*i),dp));
        }
        return dp[n]=res;
    }
}