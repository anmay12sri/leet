class Solution {
    static int c[][];
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();

        char c1[]=text1.toCharArray();
        char c2[]=text2.toCharArray();
        c=new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                c[i][j] = -1;
            }
        }

        return lcs(c1,c2,m,n);
    }
    public static int lcs(char c1[],char c2[],int i,int j){
         
        if(i==0||j==0){
            return 0;
        }
        if (c[i][j] != -1) {
            return c[i][j];
        }
        int val=0;
        if(c1[i-1]==c2[j-1]){
            val=1+lcs(c1,c2,i-1,j-1);
        }else{
            val=Math.max(lcs(c1,c2,i-1,j),lcs(c1,c2,i,j-1));
        }
        c[i][j]=val;
        return val;
    }
}