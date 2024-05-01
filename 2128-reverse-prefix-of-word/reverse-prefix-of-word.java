class Solution {
    public String reversePrefix(String word, char ch) {
        int x=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                x=i;
                break;
            }
        }
       char[] charArray = word.toCharArray();
        
        int j = 0;
        while (j <= x) {
            char temp = charArray[j];
            charArray[j] = charArray[x];
            charArray[x] = temp;
            j++;
            x--;
        }
        return new String(charArray);
    }
}