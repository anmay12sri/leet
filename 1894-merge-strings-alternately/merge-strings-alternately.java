class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res=new StringBuilder();
        int n=word1.length()+word2.length();

        for(int i=0;i<n;i++){
            if(i<word1.length())res.append(word1.charAt(i));
            if(i<word2.length())res.append(word2.charAt(i));
        }
        return res.toString();
    }
}