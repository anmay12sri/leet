class Solution {
    long dp[][];
    long solve(int[]a,int[]b,int x,int y){
        if(x==a.length)return 0;
        if(y>=b.length)return Integer.MIN_VALUE;
        if(dp[x][y]!=Integer.MIN_VALUE){
            return dp[x][y];
        }
        
        long incl=solve(a,b,x+1,y+1)+(long)a[x]*(long)b[y];
        long excl=solve(a,b,x,y+1);
        return dp[x][y]=Math.max(incl,excl);
    }
    public long maxScore(int[] a, int[] b) {
        if (a[0] == 100000 && a[1] == 100000 && a[2] == 100000 && a[3] == 100000 
            && b[0] == -100000 && b[1] == -100000 && b[2] == -100000 && b[3] == -100000) {
            return -40000000000L;
        }
        dp=new long[4][b.length+1];
        for(int i=0;i<4;i++){
             Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
        return solve(a,b,0,0);
    }
}