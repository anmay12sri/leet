class Solution {
    public boolean solve(String s,int i,int j){
        if(i>=j){
            return true;
        };

        if(s.charAt(i)==s.charAt(j)){
            return solve(s,i+1,j-1);
        }
        return false;
    }
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int sp=0;
        int max=0;

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