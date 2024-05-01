class Solution {
    public String reversePrefix(String word, char ch) {
        int x=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                x=i;
                break;
            }
        }
        char c[]=word.toCharArray();

        int j=0;
        while(j<x){
            char temp=c[j];
            c[j]=c[x];
            c[x]=temp;
            j++;
            x--;
        }
        return new String(c);
    }
}