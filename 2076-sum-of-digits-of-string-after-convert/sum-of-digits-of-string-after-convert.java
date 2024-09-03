class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for(int i=0;i<s.length();i++){
          int x=s.charAt(i)-'a'+1;

          while(x>0){
            sum+=x%10;
            x/=10;
          }

        }
        while(k-->1){
          int nsum=0;
          while(sum>0){
            nsum+=sum%10;
            sum/=10;

          } 
          sum=nsum;
        }
        return sum;
    }
}