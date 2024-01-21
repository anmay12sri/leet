class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length()+word2.length();
        StringBuilder str=new StringBuilder();

        for(int i=0;i<n;i++){
            if(i<word1.length())str.append(word1.charAt(i));
            if(i<word2.length())str.append(word2.charAt(i));
        }
        return str.toString();

    }
}