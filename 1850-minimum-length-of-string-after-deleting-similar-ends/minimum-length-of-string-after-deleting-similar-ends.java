class Solution {
    public int minimumLength(String s) {
       int l=0;
       int r=s.length()-1;

       while(l<r){
           if(s.charAt(l)!=s.charAt(r))break;
           while(l<r && s.charAt(l)==s.charAt(l+1))l++;
           while(l<r && s.charAt(r)==s.charAt(r-1))r--;
           l++;
           r--;
       } 
       if(l>r)return 0;
       else
       return r-l+1;
    }
}