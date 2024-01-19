class Solution {
    public boolean rotateString(String s, String goal) {
       if(s.length()!=goal.length())return false;

       StringBuilder str=new StringBuilder(goal);

       str=str.append(str);

       if(str.indexOf(s)!=-1){
           return true;
       }
       return false;
        
    }
}