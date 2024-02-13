class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(ispali(s))return s;
        }
        return "";
    }
    public boolean ispali(String s){
        int l=0;
        int r =s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}