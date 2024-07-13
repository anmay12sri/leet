class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;

        int y=x;
        int rev=0;
        while(y!=0){
            int z=y%10;
            rev=rev*10+z;
            y/=10;
        }
        if(rev==x){
            return true;
        }
        return false;
    }
}