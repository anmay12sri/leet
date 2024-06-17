class Solution {
    public boolean judgeSquareSum(int c) {
      long b=(long)Math.sqrt(c);
      long a=0;

      while(a<=b){
        long t=a*a+b*b;
        if(t==c){
            return true;
        }
        if(t<c){
            a++;
        }else{
            b--;
        }
      }
      return false;

    }
}