class Solution {
    public int appendCharacters(String s, String t) {
        int x=s.length();
        int y=t.length();
        int i=0;
        int j=0;
        while(i<x && j<y){
           if(s.charAt(i)==t.charAt(j))
            j++;
            i++;
           
        }
        return y-j;
    }
}