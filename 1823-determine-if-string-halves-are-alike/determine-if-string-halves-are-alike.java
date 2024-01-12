class Solution {
    public boolean halvesAreAlike(String s) {
      int count1=0;
      int count2=0;
      int n=s.length();
       s=s.toLowerCase();
      for(int i=0,j=(n/2);i<n/2&&j<n;i++,j++){
          char c=s.charAt(i);
          if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
              count1++;
          char d=s.charAt(j);
          if(d=='a'||d=='e'||d=='o'||d=='i'||d=='u')
              count2++;
      }
      return count1==count2;
    }
}