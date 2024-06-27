class Solution {
    private Boolean[][]memo;
    public boolean solve(String s,int i,int j){
        if(i>=j){
            return true;
        };
        if(memo[i][j]!=null){
            return memo[i][j];
        }

        if(s.charAt(i)==s.charAt(j)){
            memo[i][j]= solve(s,i+1,j-1);
            return memo[i][j];
        }
        memo[i][j]=false;
        return false;
    }
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int sp=0;
        int max=0;
        memo =new Boolean[s.length()][s.length()];

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(solve(s,i,j)==true){
                    if(j-i+1>max){
                        max=j-i+1;
                        sp=i;
                    }
                }
            }
        }
        return s.substring(sp,sp+max);
    }
}