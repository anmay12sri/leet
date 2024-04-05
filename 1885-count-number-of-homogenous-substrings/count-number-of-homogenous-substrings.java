class Solution {
    public int countHomogenous(String s) {
        int res=0;
        int length=0;
        int mod=1000000007;

        for(int i=0;i<s.length();i++){
            if(i==0||s.charAt(i)==s.charAt(i-1)){
                length++;
            }else{
                length=1;
            }
            res=(length+res)%mod;
        }
        return res;
    }
}