class Solution {
    public String compressedString(String word) {
        int count=1;
        StringBuilder st=new StringBuilder();
        char prev=word.charAt(0);

        for(int i=1;i<word.length();i++){
            char ch=word.charAt(i);
            if(prev==ch && count<9){
                count++;
                prev=ch;
            }else{
                st.append(count).append(prev);
                prev=ch;
                count=1;
            }
        }
        st.append(count).append(prev);
        return st.toString();
    }
}