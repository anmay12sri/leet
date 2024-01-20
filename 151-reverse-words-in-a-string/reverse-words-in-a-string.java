class Solution {
    public String reverseWords(String s) {
        String ans="";
      String words[]=s.split("\\s+");//split like a word and put into a array
      for(String w:words){
          if(ans=="")ans=w;
          else ans=w+" "+ans;
      }  
      return ans;
    }
}