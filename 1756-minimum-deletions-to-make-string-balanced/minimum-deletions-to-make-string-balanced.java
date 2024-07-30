class Solution {
    public int minimumDeletions(String s) {
        int count=0,ans=0;
         for(int c:s.toCharArray()){
            if(c=='b'){
                count++;
            }else if(count>0){
                ans++;
                count--;
            }
         }
         return ans;
    }
}