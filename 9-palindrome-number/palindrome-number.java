class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0)){
            return false;
        }
       int rev=0;
       int y=x;
       int z=0;
       while(x!=0){
          z=x%10;
          rev=rev*10+z;
          x/=10;
       } 
       if(rev==y){
           return true;
       }
       return false;
    }
}