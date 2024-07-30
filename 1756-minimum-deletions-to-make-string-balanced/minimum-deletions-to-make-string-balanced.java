class Solution {
    public int minimumDeletions(String s) {
        int count=0,ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                count++;
            }else if(count>0){
                ans++;
                count--;
            }
        }
        return ans;
    }
}