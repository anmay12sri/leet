class Solution {
    public boolean isPalindrome(int x) {
      int y=x;
      int rev=0;
      if(x<0)return false;

      while(x!=0){
        int z=x%10;
        rev=rev*10+z;
        x/=10;
      }
      if(rev==y){
        return true;
      }
      return false;

    }
}